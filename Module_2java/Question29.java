package Module_2java;
import java.util.*;
//W.A.J. P to create one thread by extending Thread class in another Class
class MyThread extends Thread {
    public Object sleep() {
		return null;
	}

	@Override
    public void run() {
        // Code to be executed in the thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question29 {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread

        // Code that runs concurrently with the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(1500); // Sleep for
            }
            finally {
            	Thread.sleep(1500);
            }
        }
    }
}
