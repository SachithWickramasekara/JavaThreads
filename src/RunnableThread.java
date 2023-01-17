public class RunnableThread implements Runnable {
    private int[] arr;
    public RunnableThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int num : arr) {
            System.out.println(Thread.currentThread().getName() + " " + num);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
