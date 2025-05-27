import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExample {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to write to the file: ");
        String userInput = scanner.nextLine();

        // Write the string to the output.txt file
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(userInput);
            System.out.println("Data has been written to output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Close the scanner
        scanner.close();
    }
}
