public class BankingApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, 0);
        Thread careerMindedWifeThread = new CareerMindedWife(account, "Career Minded Wife Thread");
        Thread stayAtHomeHusband = new HouseBasedHusband(account, "Stay at Home Husband Thread");

        careerMindedWifeThread.start();
        stayAtHomeHusband.start();
    }
}
