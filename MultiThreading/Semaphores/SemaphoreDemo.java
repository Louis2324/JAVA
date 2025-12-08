package MultiThreading.Semaphores;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2); // only 2 threads allowed

        Runnable r = () -> {
            try {
                sem.acquire(); // wait for a permit
                System.out.println(Thread.currentThread().getName() + " acquired");
                Thread.sleep(500);
                sem.release(); // release permit
                System.out.println(Thread.currentThread().getName() + " released");
            } catch (InterruptedException e) {
            }
        };

        for (int i = 0; i < 5; i++) new Thread(r, "T" + i).start();
    }
}
