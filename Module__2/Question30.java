package Module__2;
//W.A.J.P to create 2 threads and execute that threads by providing sleep 
//time as 2000ms and check the execution.
public class Question30 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(2000)); // Creating thread with sleep time of 2000ms
        Thread thread2 = new Thread(new MyRunnable(2000));

        thread1.start(); // Starting the first thread
        thread2.start(); // Starting the second thread

        try {
            thread1.join(); // Waiting for the first thread to complete
            thread2.join(); // Waiting for the second thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have completed.");
    }
}

class MyRunnable implements Runnable {
    private final int sleepTime;

    public MyRunnable(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getId());
        try {
            Thread.sleep(sleepTime); // Sleeping for the specified time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread completed: " + Thread.currentThread().getId());
    }
}
