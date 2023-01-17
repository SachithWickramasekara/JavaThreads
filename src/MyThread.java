import sun.applet.Main;

public class MyThread extends Thread{
    private int[] dataset;

    public MyThread(String name, int[] dataset) {
        super(name);
        this.dataset = dataset;
    }

    @Override
    public void run() {
        for (int data : dataset) {
            System.out.println(Thread.currentThread().getName() + " " + Math.pow(data, 2));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
