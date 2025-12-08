package MultiThreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskO implements Runnable {
    private final int id;

    TaskO(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Task " + id + " is running on " + Thread.currentThread().getName());
    }
}

public class OneByOne {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3); // 3 threads

        // Submit tasks one by one
        for (int i = 1; i <= 5; i++) {
            pool.execute(new TaskO(i));
        }

        pool.shutdown(); // stop accepting new tasks
    }
}
