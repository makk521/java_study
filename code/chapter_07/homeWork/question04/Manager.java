package code.chapter_07.homeWork.question04;

public class Manager extends Employee{
    double salaryLevel = 1.2;
    double bonus = 1000;
    public Manager(String name, double salaryPerDay, int workDays) {
        super(name, salaryPerDay, workDays);
    }
    
    public double getSalary(){
        return salaryLevel * salaryPerDay *workDays + bonus;
    }

    public void showSalary(){
        System.out.println("大牛马工资 = " + getSalary());
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
