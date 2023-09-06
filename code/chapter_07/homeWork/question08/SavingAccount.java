package code.chapter_07.homeWork.question08;
/*
 * (2)扩展前一个练习的BankAccount类，新类 SavingsAccount每个月都有利息产生(earnMonthlyInterest方法被调用)，
 * 并且有每月三次免手续费的存款或取款。在earn MonthlyInterest方法中重置交易计数
 */
public class SavingAccount extends BankAccount{
    private int count = 3;//免费用次数
    private double rate = 0.01;
    private double serviceCharge = 1;
    public SavingAccount(double initialBanlance) {
        super(initialBanlance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //存款
    public void deposit(double amount){
        if(count > 0){
            super.deposit(amount);
            count--;
        }else{
            super.deposit(amount - serviceCharge);
        }
    }

    public void withdraw(double amount){
        if(count > 0){
            super.withdraw(amount);
            count--;
        }else{
            super.withdraw(amount + serviceCharge);
        }
    }

    public void earnMonthlyInterest(){
        //统计上个月利息且重置免费次数
        count = 3;
        super.deposit(getBalance() * rate);
    }
    
}
