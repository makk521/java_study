package code.chapter_07.Override;

public class Student extends Person{
    int id;
    private int score;
    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return super.say() + " id = " + this.id + " scaore = " + this.score;
    }
}
