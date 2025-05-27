import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names (type 'done' to stop):");

        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            studentNames.add(name);
        }

        System.out.println("\nList of student names entered:");
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }

        scanner.close();
    }
}
