public class Application {
    public static void main(String[] args) {
        MailBox mailBox = new MailBox(0);
        Runnable producerRunnable = new Producer(mailBox);
        Thread producerThread = new Thread(producerRunnable, "Producer");

        Runnable consumerRunnable = new Consumer(mailBox);
        Thread consumerThread = new Thread(consumerRunnable, "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}
