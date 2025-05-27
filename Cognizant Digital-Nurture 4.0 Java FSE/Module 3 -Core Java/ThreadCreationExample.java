class MessageThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Message " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread();
        MessageThread thread2 = new MessageThread();

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}