import java.util.*;

class simpleCalc{
	public static void main(String args[]){
		System.out.println("");
		Scanner scan;
		int num1=0, num2=0, choice, ans;

		while(true){
			System.out.println("\t Simple Calculator");
		
			System.out.println("\n\t1. Add");
			System.out.println("\t2. Subtract");
			System.out.println("\t3. Multiply");
			System.out.println("\t4. Divide");
			System.out.println("\t5. Exit");
			
			scan = new Scanner(System.in);
			choice = scan.nextInt();

			if(choice!=5){
				System.out.println("Enter Number 1: ");
				num1 = scan.nextInt();
				System.out.println("Enter Number 2: ");
				num2 = scan.nextInt();
			}

			switch(choice){
				case 1:
					ans = num1 + num2;
					System.out.println("\t"+ans);
					break;
				case 2:
					ans = num1 - num2;
					System.out.println("\t"+ans);
					break;
				case 3:
					ans = num1 * num2;
					System.out.println("\t"+ans);
					break;
				case 4:
					try{
						ans = num1 / num2;
						System.out.println("\t"+ans);
					}
					catch(Exception e){
						System.out.println("Infinity");
					}
					break;
				case 5:
					scan.close();
					System.exit(0);
					break;
				default:
					System.out.println("Error");
			}
		}
	}
}