import java.util.*;
import java.util.concurrent.*;

public class ExecutorCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = Arrays.asList(
            () -> "Task 1",
            () -> "Task 2",
            () -> "Task 3"
        );
        for (Future<String> result : service.invokeAll(tasks)) {
            System.out.println(result.get());
        }
        service.shutdown();
    }
}