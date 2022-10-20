public class Client extends Thread {
    Bank bank;

    public Client(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            try {
                bank.money += 10;
                sleep(10);
                bank.money -= 10;
                sleep(10);
                System.out.println(bank.money);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
