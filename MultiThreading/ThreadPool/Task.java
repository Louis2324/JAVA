package MultiThreading.ThreadPool;

class Task implements Runnable {
    public void run() {
        System.out.println("Hello"); // Do something!
    }
}