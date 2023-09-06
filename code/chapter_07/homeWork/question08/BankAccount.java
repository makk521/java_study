package code.chapter_07.homeWork.question08;
/*
 * (1)在上面类的基础上扩展新类CheckingAccount对每次存款和取款都收取1美元的手续费
 */
public class BankAccount {
    private double balance;//余额

    public BankAccount(double initialBanlance){
        this.balance = initialBanlance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println(balance);
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
