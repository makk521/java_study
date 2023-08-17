package code.chapter_07.extend_1;

public class Pupil extends Student{
    String studentId;
    // 显式构造函数，调用父类的有参构造函数
    public Pupil(String name, int age,  String studentId) {
        super(name, age); // 调用父类构造函数
        this.studentId = studentId; // 子类自己的初始化
    }
    public void info(){
        System.out.println("name = " + this.name + "\t" + "score = " + this.score + "\t" + "studentid = " + this.studentId);
    }

}
