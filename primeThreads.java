// Each thread process n num, last one 2, print in asccending order all primes in that range

class task{
	int flag;
	int arr[] = new int[50];

	task(int flag){
		this.flag = flag;
	}

	public void run(){
		if(flag==0){
			System.out.println("First Thread");
			for (int i = 0; i < 20; i++) {
				if(arr[i] % 2 != 0){
					System.out.println("Prime number found: "+arr[i]);
				}
			}
		}

		if(flag==1){
			System.out.println("Second Thread");
			for (int i = 21; i < 40; i++) {
				if(arr[i] % 2 != 0){
					System.out.println("Prime number found: "+arr[i]);
				}
			}
		}

		if(flag==2){
			System.out.println("Third Thread");
			for (int i = 41; i < arr.length; i++) {
				if(arr[i] % 2 != 0){
					System.out.println("Prime number found: "+arr[i]);
				}
			}
		}
	}
}

class primeThreads{
	public static void main(String args[]){
		
	}
}