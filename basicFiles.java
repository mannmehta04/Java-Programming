import java.io.*;

class basicFiles{
    public static void main(String[] args){
        File f1 = new File("./text.txt");
        try{
            if(f1.createNewFile())
                System.out.println("File Created");
        }
        catch(Exception e){
            System.out.println("File Not Created");
        }            
    }
}