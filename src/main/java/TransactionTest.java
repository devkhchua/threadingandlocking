public class TransactionTest {
    public static void main(String[] args){
        //Bank bank = new Bank();
        //BankWithSynchronizedFunction bank = new BankWithSynchronizedFunction();
        BankWithLocks bank = new BankWithLocks();

        for(int i = 0; i< Bank.MAX_ACCOUNT; i++){
            Thread t = new Thread(new Transaction(bank, i));
            t.start();
        }
    }
}
