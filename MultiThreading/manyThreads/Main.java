package MultiThreading.manyThreads;

public class Main {
    public static void main(String[] args) {
        NewThread thread1 = new NewThread("One");
        NewThread thread2 = new NewThread("Two");
        NewThread thread3 = new NewThread("Third");
        thread1.t.start();
        thread2.t.start();
        thread3.t.start();
        try {
            Thread.sleep(1000);

        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
