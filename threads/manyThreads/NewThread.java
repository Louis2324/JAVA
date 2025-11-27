package threads.manyThreads;

class NewThread  implements Runnable {
    String name;
    Thread t;
    NewThread(String threadName){
        name=threadName;
        t=new Thread(this,name);
        System.out.println("New Thread: "+t);
    }
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}