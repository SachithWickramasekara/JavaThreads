public class CareerMindedWife extends Thread {
    private BankAccount account;

    public CareerMindedWife(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            account.deposit(5000);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
