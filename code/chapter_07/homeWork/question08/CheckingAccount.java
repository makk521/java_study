package code.chapter_07.homeWork.question08;

public class CheckingAccount extends BankAccount{
    double serviceCharge = 1;

    public CheckingAccount(double initialBanlance, double serviceCharge) {
        super(initialBanlance);
        this.serviceCharge = serviceCharge;
    }

    public void deposit(double amount){
        // setBalance(amount + getBalance() - serviceCharge); //自己的方法
        super.deposit(amount - serviceCharge);             //老师的方法
    }

    public void withdraw(double amount){
        setBalance(getBalance() - amount - serviceCharge);
        System.out.println(getBalance());
        // super.withdraw(amount + 1);
    }

}
