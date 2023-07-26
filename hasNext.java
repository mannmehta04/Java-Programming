import java.util.Scanner;

class hasNext{
    public static void main(String[] args){

        int arr[] = new int[10];

        System.out.println("Enter numerical input, if done, press Ctrl + D to get Output:");
        Scanner scan = new Scanner(System.in);

        int len=0;
        while(scan.hasNext()){
            arr[len]=scan.nextInt();
            len++;
        }

        System.out.println("Your Data:");
        for(int i=0; i<len;i++){
            System.out.println(arr[i]);
        }

        scan.close();
    }
}