import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Apple");
        strings.add("Orange");
        strings.add("Grapes");

        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted List: " + strings);
    }
}