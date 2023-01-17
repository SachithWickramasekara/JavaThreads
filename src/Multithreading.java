public class MultiThreading {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        System.out.println(10/0);
        Thread thread = new MyThread("My thread", new int[]{1, 2, 3, 4});
        thread.start();

        int[] arr = {5, 6, 7, 8};

        Thread thread1 = new MyThread("Second thread", arr);
        thread1.start();

        for (int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int[] arr2 = {9, 10, 11, 12};
        Runnable runnable = new RunnableThread(arr2);
        Thread thread2 = new Thread(runnable, "Thread 3");
        thread2.start();
    }
}
