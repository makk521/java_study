package code.chapter_07.homeWork.question03;

public class Teacher {
    String name;
    int age;
    String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void introduce(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", age=" + age + ", post=" + post + ", salary=" + salary + "]";
    }

    public double getSalary(){
        return salary;
    }
    
}
