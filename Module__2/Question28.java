package Module__2;
//W.A.J. P to create one thread by implementing Runnable interface in Class
public class Question28 implements Runnable {

    @Override
    public void run() {
        // Code to be executed in the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the MyRunnable class
        Question28 myRunnable = new Question28();
        
        // Create a thread using the MyRunnable instance
        Thread thread = new Thread(myRunnable);
        
        // Start the thread
        thread.start();
    }
}
