package code.chapter_07.PolyArray_;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, int age, int salary) {
    super(name, age);
    this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    public String say() {
        return super.say() + "\t" + salary;
    }

    public void teach(){
        System.out.println("老师正在教学");
    }
}
