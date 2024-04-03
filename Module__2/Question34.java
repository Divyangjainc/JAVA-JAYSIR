package Module__2;
//TestDaemonThread2 t1=new TestDaemonThread2(); o
//TestDaemonThread2 t2=new TestDaemonThread2(); t1.start() o
//t1.setDaemon(true);//will throw exception here t2.start(); 
class TestDaemonThread2 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running.");
        } else {
            System.out.println("User thread is running.");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();
        
        t1.setDaemon(true);
        t1.start();
        
        t2.start();
    }
}
