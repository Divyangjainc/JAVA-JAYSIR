package Module_2;
//W.A.J.P to create 2 threads and make one thread as Daemon Thread by 
//using set Daemon () method of Thread class and check whether the thread 
//is set daemon or not by using is Daemon () method
public class Question33 {
    public static void main(String[] args) {
        Thread thread1 = new Thread("Thread 1");
        Thread thread2 = new Thread("Thread 2");

        // Set thread1 as a daemon thread
        thread1.setDaemon(true);

        // Start both threads
        thread1.start();
        thread2.start();

        // Check if thread1 is a daemon thread
        System.out.println(thread1.getName() + " is daemon thread: " + thread1.isDaemon());

        // Check if thread2 is a daemon thread
        System.out.println(thread2.getName() + " is daemon thread: " + thread2.isDaemon());

        // Main thread ends here, daemon threads may terminate
    }
}

class Question implements Runnable {
    @Override
    public void run() {
        try {
            if (Thread.currentThread().isDaemon()) {
                System.out.println(Thread.currentThread().getName() + " is a daemon thread.");
            } else {
                System.out.println(Thread.currentThread().getName() + " is a user thread.");
            }
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
