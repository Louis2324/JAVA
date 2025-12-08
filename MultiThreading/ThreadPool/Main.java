package MultiThreading.ThreadPool;
import java.util.concurrent.*;

class Main {
    public static void main(String[] args) {
        Executor pool = Executors.newFixedThreadPool(2); // pool of 2 threads
        for (int i = 0; i < 10; i++)
            pool.execute(new Task()); // submit 10 tasks
    }
}