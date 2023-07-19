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
        // display();
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

        // display();
        return removedData;
    }

    void display(){
        System.out.println("\n");
        for(int i=max-1;i>=0;i--){
            System.out.println(stk[i]+"\n");
        }
    }
}

public class stack_args {
    public static void main(String[] args){
        stacks s1 = new stacks();
        System.out.println("\n");

        for(int i=0; i<args.length; i++){
            switch(args[i]){
                case "push":
                    try {
                        s1.pushData(Integer.parseInt(args[i+1]));
                        i++;
                    }
                    catch (Exception e) {
                        System.out.println("Not Enough Arguments.");
                        // System.exit(0);
                        continue;
                    }
                    break;
                case "pop":
                    int removedData = s1.popData();
                    System.out.println("Removed "+removedData+" from Stack");
                    break;
                case "display":
                    s1.display();
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
}