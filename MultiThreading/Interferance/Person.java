package MultiThreading.Interferance;

class Person extends Thread {
    public void run() {
        PersonMain.c = 5;
    }
}
class PersonMain {
    public static int c = 0;
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println(c);
        Thread t = new Thread(new Person());
        t.start();
        System.out.println(c);
        t.join();
        System.out.println(c);
    }
}