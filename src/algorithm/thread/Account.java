package algorithm.thread;

public class Account {
    long balance;

    public synchronized void deposit(long amount){
        balance = balance + amount;
    }

    public void inquiry(){
        System.out.println("balance: " + balance);
    }
}
