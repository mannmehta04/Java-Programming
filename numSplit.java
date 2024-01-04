import java.util.Random;

class NumberGenerator implements Runnable {
    private SharedResource sharedResource;
    private Random random;

    public NumberGenerator(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
        this.random = new Random();
    }

    public void run() {
        while (true) {
            int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            sharedResource.set(randomNumber);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenChecker implements Runnable {
    private SharedResource sharedResource;

    public EvenChecker(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        while (true) {
            int number = sharedResource.get();
            if (number % 2 == 0) {
                System.out.println("Square of even number " + number + " is " + (number * number));
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddChecker implements Runnable {
    private SharedResource sharedResource;

    public OddChecker(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        while (true) {
            int number = sharedResource.get();
            if (number % 2 != 0) {
                System.out.println("Cube of odd number " + number + " is " + (number * number * number));
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SharedResource {
    private int number;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return number;
    }

    public synchronized void set(int number) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = number;
        available = true;
        notifyAll();
    }
}

public class numSplit {
	public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        NumberGenerator numberGenerator = new NumberGenerator(sharedResource);
        EvenChecker evenChecker = new EvenChecker(sharedResource);
        OddChecker oddChecker = new OddChecker(sharedResource);

        Thread t1 = new Thread(numberGenerator);
        Thread t2 = new Thread(evenChecker);
        Thread t3 = new Thread(oddChecker);

        t1.start();
        t2.start();
        t3.start();
    }
}
