package code.chapter_07.homeWork.question13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    //老师特有方法
    public void teach(){
        System.out.println("我承诺我会好好教学");
    }
    //方法重写，子类都有
    public String play(){
        return super.play() + "象棋（老师）！";
    }

    public void showInfo(){
        System.out.println("老师的信息：");
        System.out.println((super.returnInfoBase()));
        System.out.println("work_age : " + work_age);
        teach();
        System.out.println(play());
        System.out.println("==================================");
    }
    
    @Override
    public String toString() {
        return "Teacher [work_age=" + work_age + "]" + super.toString();
    }
}
