class task{
	int flag;
	int arr[] = new int[4];
	
	synchronized void tasks(int flag){
		if(flag == 1){
			System.out.println("Generating Numbers...");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=i;
			}
		}

		else if(flag == 2){
			System.out.println("Checking for Even Squares");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 0){
					System.out.println(arr[i]+" = "+(arr[i]*arr[i])+" ");
				}
			}
		}

		else if(flag == 3){
			System.out.println("Checking for Odd Cubes");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 != 0){
					System.out.println(arr[i]+" = "+(arr[i]*arr[i]*arr[i])+" ");
				}
			}
		}
	}
}

class generateNum extends Thread{
	task t;

	generateNum(task t){
		this.t = t;
	}

	public void run(){
		t.tasks(1);
	}
}

class chkEven extends Thread{
	task t;

	chkEven(task t){
		this.t = t;
	}

	public void run(){
		t.tasks(2);
	}
}

class chkOdd extends Thread{
	task t;

	chkOdd(task t){
		this.t = t;
	}

	public void run(){
		t.tasks(3);
	}
}

class triThreads{
	public static void main(String[] args){

		task t = new task();

		generateNum t1 = new generateNum(t);
		chkEven t2 = new chkEven(t);
		chkOdd t3 = new chkOdd(t);

		t1.start();
		t2.start();
		t3.start();
	}
}