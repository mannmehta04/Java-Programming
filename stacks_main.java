import java.util.*;

class stacks{
    int[] stk;
    int top;
    int max = 3;
    Scanner scan=new Scanner(System.in);

    stacks(){
        stk = new int[max];
        top = -1;
    }

    void pushData(int dummyData){
        try{
            top++;
            stk[top] = dummyData;
        }
        catch(Exception e){
            System.out.println("Stack Overflow");
            System.exit(0);
        }
    }

    int popData(){
        int removedData=0;

        try{
            removedData = stk[top];
            stk[top] = 0;
            top--;
        }
        catch(Exception e){
            System.out.println("Stack Undeflow");
            System.exit(0);
        }

        return removedData;
    }

    void display(){
        System.out.println("\n");
        for(int i=max-1;i>=0;i--){
            System.out.println(stk[i]+"\n");
        }
    }
}

class stacks_main {
    public static void main(String[] args){

        System.out.println("\n");

        stacks s1 = new stacks();
        int choice;
        Scanner scan;

        while(true){
			System.out.println("\t Simple Stack Management");
		
			System.out.println("\n\t1. Push");
			System.out.println("\t2. Pop");
			System.out.println("\t3. Display");
            System.out.println("\t4. Exit");
			
			scan = new Scanner(System.in);
			choice = scan.nextInt();

			switch(choice){
				case 1:
                    System.out.println("Enter number to be pushed");
                    int input =scan.nextInt();
					s1.pushData(input);
					break;
				case 2:
					int popped = s1.popData();
                    System.out.println(popped+" is now Popped.");
					break;
                case 3:
                    s1.display();
                    break;
				case 4:
                    scan.close();
					System.exit(0);
					break;
				default:
					System.out.println("Error");
			}
		}
    }
}