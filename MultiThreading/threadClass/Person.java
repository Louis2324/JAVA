package MultiThreading.threadClass;

class Person  extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }
}