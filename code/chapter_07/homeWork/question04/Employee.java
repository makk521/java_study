package code.chapter_07.homeWork.question04;

public class Employee {
    String name;
    double salaryPerDay;
    int workDays;
    public Employee(String name, double salaryPerDay, int workDays) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.workDays = workDays;
    }

    public double getSalary(){
        return salaryPerDay * workDays;
    }
    
    public void showSalary(){
        System.out.println("普通员工工资：" + getSalary());
    }

}
