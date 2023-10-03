import java.util.*;
import java.io.*;

public class bufferWriter {
	public static void main(String args[]){
		try{
			Scanner sc = new Scanner(System.in);
			FileWriter fw = new FileWriter("data1.txt");
			BufferedWriter bf = new BufferedWriter(fw);
			FileReader fr = new FileReader("data1.txt");

			//fr.readLine();
			System.out.println(fr.read());
			bf.close();
			fw.close();
			fr.close();
			sc.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
