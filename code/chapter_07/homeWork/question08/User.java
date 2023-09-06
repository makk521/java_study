package code.chapter_07.homeWork.question08;

public class User {
    public static void main(String[] args){
        // CheckingAccount myAccount = new CheckingAccount(100, 1);
        // myAccount.withdraw(10);

        SavingAccount myAccount2 = new SavingAccount(1000);
        myAccount2.deposit(100);
        myAccount2.deposit(100);
        myAccount2.deposit(100);
        myAccount2.deposit(100);
    }
}
