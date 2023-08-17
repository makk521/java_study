package code.chapter_07.PolyArray_;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
    super(name, age);
    this.score = score;
    }   

    public double getscore() {
        return score;
    }

    public void setscore(double score) {
        this.score = score;
    }

    //重写父类say方法
    public String say(){
        return super.say() + "\t" + score;
    }

    public void study(){
        System.out.println("学生在学习");
    }
}
