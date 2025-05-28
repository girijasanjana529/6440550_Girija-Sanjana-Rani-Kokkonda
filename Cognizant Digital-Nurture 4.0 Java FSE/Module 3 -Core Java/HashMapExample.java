import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Get student by ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 1) {
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();  
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                studentMap.put(id, name);
                System.out.println("Student added.");
            } else if (choice == 2) {
                System.out.print("Enter student ID to retrieve name: ");
                int id = scanner.nextInt();
                if (studentMap.containsKey(id)) {
                    System.out.println("Student Name: " + studentMap.get(id));
                } else {
                    System.out.println("Student not found.");
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}