package code.chapter_07.homeWork.question04;

public class User {
    public static void main(String[] args){
        User user = new User();
        Employee p = new Manager("ma", 1000, 11);
        p.showSalary();
        ((Manager)p).setBonus(2000);//向下转型，编译类型与运行类型不一样(子父类关系)时，调用子类方法即运行类型方法需要向下转型
        p.showSalary();
        p = new Worker("zh", 20, 30);
        p.showSalary();
    }
}
