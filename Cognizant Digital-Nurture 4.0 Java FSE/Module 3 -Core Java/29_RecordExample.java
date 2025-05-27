import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Diana", 28));
        System.out.println("All People:");
        people.forEach(System.out::println);
        List<Person> olderThan30 = people.stream()
                                         .filter(person -> person.age() > 30)
                                         .collect(Collectors.toList());

        System.out.println("\nPeople older than 30:");
        olderThan30.forEach(System.out::println);
    }
}
record Person(String name, int age) { }
