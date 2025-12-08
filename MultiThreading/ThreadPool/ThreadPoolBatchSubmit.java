package MultiThreading.ThreadPool;

import java.util.concurrent.*;
import java.util.*;

class CallableTask implements Callable<String> {
    private final int id;
    CallableTask(int id) { this.id = id; }
    public String call() {
        return "Task " + id + " done by " + Thread.currentThread().getName();
    }
}

public class ThreadPoolBatchSubmit {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // Prepare a collection of Callable tasks
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) tasks.add(new CallableTask(i));

        // Submit all tasks at once
        List<Future<String>> results = pool.invokeAll(tasks);

        // Get results
        for (Future<String> f : results) {
            System.out.println(f.get());
        }

        pool.shutdown();
    }
}
