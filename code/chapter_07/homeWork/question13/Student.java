package code.chapter_07.homeWork.question13;

public class Student extends Person{
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    //Student特有方法
    public void study(){
        System.out.println("我承诺我会好好学习！");
    }
    //方法重写，子类都有
    public String play(){
        return super.play() + "爱玩足球（学生）！";
    }

    public void showInfo(){
        System.out.println("学生信息为：");
        System.out.println(super.returnInfoBase());
        System.out.println("stu_id : " + stu_id);
        study();
        System.out.println(play());
        System.out.println("==================================");
    }
    
    @Override
    public String toString() {
        return "Student [stu_id=" + stu_id + "]" + super.toString();
    }

}
