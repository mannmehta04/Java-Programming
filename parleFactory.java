class batch{
    // 0 - empty, 1 - full
    volatile int flag;
    int packs;

    batch(){
        flag = 0;
    }

    synchronized void create(int packs){
        if(flag==1){
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        this.packs = packs;
        flag = 1;
        notify();
    }

    synchronized void sell(){
        if(flag==0){
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        System.out.println("Packet Delivered. Further Packets will be produced.");
        flag = 0;
        notify();
    }
}

class plant extends Thread{

    batch monaco;

    plant(){
        super();
        monaco = null;
    }

    plant(batch biscuitName){
        super();
        monaco = biscuitName;
        start();
    }

    public void run(){
        for(int i=1;i<=3;++i){
            monaco.create(i);
            try {
                System.out.println();
                System.out.println("One Packet Created. Creating another one...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }

}

class town extends Thread{

    batch monaco;
    
    town(){
        super();
        monaco = null;
    }

    town(batch biscuitName){
        super();
        monaco = biscuitName;
        start();
    }

    public void run(){
        for(int i=1;i<=3;++i){
            monaco.sell();
            try {
                System.out.println("One Packet Sold. Selling another one...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }

}

class parleFactory{
    public static void main(String[] args){
        
        batch monaco = new batch();
        plant plantOne = new plant(monaco);
        town townOne = new town(monaco);

        try {
            plantOne.join();
            townOne.join();
        } catch (InterruptedException e) {}
    }
}