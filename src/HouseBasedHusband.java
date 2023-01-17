public class HouseBasedHusband extends Thread {
    private BankAccount account;

    public HouseBasedHusband(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            account.withdraw(5000);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
