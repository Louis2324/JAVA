package MultiThreading;

public class MainProgram {
    public static void main (String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current Thread: " + thread);
        thread.setName("My thread");
        System.out.println("After name change: "+ thread);
        try{
            for(int n = 5 ; n > 0 ; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
