class Sorting extends Thread {
	static int currentMax1,currentMax2;	
	int arr[];

	Sorting(String name, int[] arr){
		super(name);
		currentMax1 = 0;
		currentMax2 = 0;
		//this.setName(name);
		this.arr = arr;
		this.start();
	}

	public void run(){
		if(Thread.currentThread().getName().equals("Final")){		
			for(int i=0;i<arr.length;i++){
				if(arr[i] > currentMax1){
					currentMax1 = arr[i];
				}
			}
		}
		else{
			for(int i=0;i<arr.length;i++){
			if(arr[i] > currentMax2){
				currentMax2 = arr[i];
			}	  
		}
	}
	}

	void sortint(){
		
		if(currentMax1 > currentMax2){
			System.out.println(currentMax1);
		}
		else{
			System.out.println(currentMax2);
		}
	}
}

public class maxMultithreading {
	
	public static void main(String args[]){

	
	
	int arr[] = {12,32,4,5,7,123,4,234};
	int arr2[] = {232,124,56,75};

	Sorting s1 = new Sorting("Final",arr);
	Sorting s2 = new Sorting("Not" , arr2);

	try {
		s1.join();
		s2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	s2.sortint();
	s1.sortint();
	
	}
}
