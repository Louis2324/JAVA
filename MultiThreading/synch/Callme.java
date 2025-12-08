package MultiThreading.synch;

public class Callme {
    synchronized void call(String message) {
        System.out.println("[" + message);

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}


