package excercises.corejava.concurrency;

public class ThreadExample {

    public static void main(String[] args) {

        //Two threads in Java which runs in Parallel
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println("This is thread : " + Thread.currentThread().getName());
                }
            }
        }, "Thread A");

        //Runnable interface is implemented using Anonymous Class
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println("This is thread : " + Thread.currentThread().getName());
                }
            }
        }, "Thread B");

        threadA.start();
        threadB.start();
    }
}

