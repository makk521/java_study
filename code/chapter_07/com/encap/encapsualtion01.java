package code.chapter_07.com.encap;

public class encapsualtion01 {
    public static void main(String[] args){
        Person person = new Person("makaka", 1800, 1000, "ceo");
        // person.setName("makaka");
        // person.setAge(19);
        // person.setSalary(2000);

        String result = person.info();
        System.out.println(result);
    }
}

class Person{
    public String name;
    private int age;
    private double salary;
    private String job;
    public Person(){
        
    }
    public Person(String name, int age, double salary, String job) {
        // this.name = name;
        // this.age = age;
        // this.salary = salary;
        // this.job = job;
        setAge(age);
        setJob(job);
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age >= 0 && age < 200){
            this.age = age;
        }else{
            System.out.println("设置年龄超出常识(1-200)");
            this.age = 18;
        }
        
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    
    public String info() {
        return "信息为 name=" + this.name + "\t" + "age=" + this.age + "\t" + "salary=" + this.salary + "\t" + "job=" + this.job;
    }
}