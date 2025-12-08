package MultiThreading.dualThreads;

class Person  implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!");
        String name = Thread.currentThread().getName();
        try{
            for (int i = 5 ; i > 0 ; i--) {
                System.out.println("Child thread "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(name+ " existing");
    }
}

