import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        // Specify the path to the file
        String fileName = "output.txt";

        // Try-with-resources to open and read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            // Read and display each line of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
