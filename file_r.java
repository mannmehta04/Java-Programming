import java.util.*;
import java.io.*;
public class file_r {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		FileWriter fw = new FileWriter("data.txt");
		FileOutputStream fout = new FileOutputStream("data.txt", true);
		FileInputStream fin = new FileInputStream("data.txt");
		FileOutputStream fout2 = new FileOutputStream("data1.txt", true);
		String str = "Kalp is No no more";
		byte[] b = str.getBytes();
		fout.write(b);	
		int c;
		String str1="";	
		while((c=fin.read()) != -1){
			System.out.print( (char)c);
			str1 += (char)c;
		}
			byte[] b1 = str1.getBytes();
			fout2.write(b1);

		fw.close();
		fin.close();
		fout.close();
		fout2.close();
		sc.close();
	}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
