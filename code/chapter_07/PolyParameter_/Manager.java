package code.chapter_07.PolyParameter_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理 " + getName());
    }

    //年工资
    public double getAnnual(){
        return super.getAnnual() + bonus;
    }

}
