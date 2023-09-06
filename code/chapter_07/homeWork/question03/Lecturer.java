package code.chapter_07.homeWork.question03;

public class Lecturer extends Teacher{
    double salaryLevel = 1.3;

    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getSalary(){
        return salaryLevel * super.getSalary();
    }

    public void introduce(){
        System.out.println("Teacher [name=" + name + ", age=" + age + ", post=" + post + ", salary=" + getSalary() + "]");
    }
}
