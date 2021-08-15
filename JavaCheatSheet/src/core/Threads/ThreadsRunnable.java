package core.Threads;

/**
 * How to create and use threads
 * How to create thread using lambda expression
 */
public class ThreadsRunnable {


    /**
     * Create a java thread via Runnable using classic code
     */
    private void threadWay1() {
        Runnable task1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Task #1 is running");
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.start();
    }

    private void threadWay2() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("The thread is running");
            }
        });
        thread.start();
    }


    /**
     * Create a java thread via runnable using lambda expression
     */
    private void threadWay3() {
        // Lambda runnable
        Runnable task = () -> {System.out.println("The thread is running"); };
        // start the thread
        new Thread(task).start();
    }
}
