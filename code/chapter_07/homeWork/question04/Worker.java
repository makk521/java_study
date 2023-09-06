package code.chapter_07.homeWork.question04;

public class Worker extends Employee{
    double salaryLevel = 1.0;

    public Worker(String name, double salaryPerDay, int workDays) {
        super(name, salaryPerDay, workDays);
    }

    public double getSalary(){
        return salaryLevel * salaryPerDay * workDays;
    }

    public void showSalary(){
        System.out.println("小牛马工资 = " +getSalary());
    }
    
}
