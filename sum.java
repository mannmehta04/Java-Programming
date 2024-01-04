class makeSum extends Thread{
	static int[] sum = new int[5];
	 int[] arr;
	 int noT;
	 static int part = 0;
	 static int max;
	makeSum(int arr[],int noT){
		super();
		this.arr = arr;
		this.noT = noT;
		this.start();
	}

	public void run(){
		int t = part++;
		max = arr.length;
		for(int pos = t * (max/noT) ; pos < (t+1) * (max/noT); pos++){
			sum[part] += arr[pos];
		}
	}

	void maxSum(){
		int total_sum = 0;
        for (int i = 0; i < 5; i++) {
            total_sum += sum[i];
        }
		System.out.println("sum is " + total_sum);
	}
}

public class sum {
	 // Driver Code
	 public static void main(String[] args) throws InterruptedException {
		int[] a = { 1, 5, 7, 10, 12, 14, 15, 18, 20, 22, 25, 27, 30, 64, 110, 220 };
         makeSum threads[] = new makeSum[4];
 
     
        for (int i = 0; i < 4; i++) {
            threads[i] = new makeSum(a,4);
        }
 
        
        for (int i = 0; i < 4; i++) {
            threads[i].join();
        }
 
        
		threads[0].maxSum();
 
        
    }
	
}
