package code.chapter_07.homeWork.question05;

public class Employee {
    String name;
    private double salaryBase;
    private int salaryMons = 12;
    
    public Employee(String name, double salaryBase) {
        this.name = name;
        this.salaryBase = salaryBase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
    }

    public int getSalaryMons() {
        return salaryMons;
    }

    public void setSalaryMons(int salaryMons) {
        this.salaryMons = salaryMons;
    }
    
    public void showSalary(){
        System.out.println(name + "工资是" + salaryBase*salaryMons);
    }
}
