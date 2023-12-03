import java.io.*;

public class buffReadPrintWrite {
	
    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
            PrintWriter writer = new PrintWriter(new FileWriter(destinationFilePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
	}
}
