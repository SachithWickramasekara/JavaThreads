public class Consumer implements Runnable {
    private MailBox mailBox;

    public Consumer(MailBox mailBox) {
        this.mailBox = mailBox;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            int value = this.mailBox.get();
            System.out.println("Thread: " + Thread.currentThread().getName() + " Consumed: " + value);
        }
    }
}
