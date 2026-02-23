package Thread;

public class threadTask implements Runnable{


    @Override
    public void run() {
        System.out.println("Thread is running " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        threadTask task = new threadTask();
        Thread t1 = new Thread(task);
        t1.start();
    }
}
