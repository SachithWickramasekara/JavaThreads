public class MailBox {
    private int mailBox;
    private boolean available;

    public MailBox(int value) {
        this.mailBox = value;
        this.available = false;
    }

    public synchronized void put(int value) {
        while (this.available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.mailBox = value;
        this.available = true;
//        System.out.println("Thread: " + Thread.currentThread().getName() + " produced: " + value);
        notifyAll();
    }

    public synchronized int get() {
        while (!this.available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        this.available = false;
//        System.out.println("Thread: " + Thread.currentThread().getName() + " Consumed: " + this.mailBox);
        return this.mailBox;
    }
}
