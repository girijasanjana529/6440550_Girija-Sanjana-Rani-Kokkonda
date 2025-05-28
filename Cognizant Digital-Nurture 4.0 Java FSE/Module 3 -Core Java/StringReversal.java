import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Using StringBuilder to reverse the string
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}