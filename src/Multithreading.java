public class Multithreading {

    public static void main(String[]args) throws InterruptedException{
        System.out.println(Thread.currentThread().getName());
        // System.out.println(5/0);

        Thread myOtherThread = new MyThread("myOtherThread", new int[]{5,6,7,8});
        myOtherThread.start();


        Runnable runnableThread = new RunnableThread(new int[]{13,14,15,16});
        Thread thread = new Thread(runnableThread,"thread");
        thread.start();


        Thread myThread = new MyThread("myThread",new int[]{1,2,3,4});
        myThread.start();

        int[] anotherArray = {9,10,11,12};
        for(int i : anotherArray){
            System.out.println("Thread name : " + Thread.currentThread().getName() + "  :  " + i);
            Thread.sleep(200);
        }
    }
}
