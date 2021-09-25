
package pckMain;


public class ThreadExampleWithRunnableNormal {

    public static void main(String[] args) {
        Thread threadOne = new Thread(new MainThreadClass(), "Thread One");
        Thread threadTwo = new Thread(new MainThreadClass(), "Thread Two");
        Thread threadThree = new Thread(new MainThreadClass(), "Thread Three");
        threadOne.start();
        threadTwo.start();   
        threadThree.start();
        System.out.println("All threads are dead/complete");
    }

}

class MainThreadClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Started thread :::"+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended thread :::"+Thread.currentThread().getName());
    }
    
}
