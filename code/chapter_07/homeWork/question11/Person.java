package code.chapter_07.homeWork.question11;
/*
 * 向上向下转型实例
 */
public class Person {
    public void run(){
        System.out.println("person run");
    }

    public void eat(){
        System.out.println("person eat");
    }
}

class Student extends Person{
    public void run(){
        System.out.println("student run");
    }

    public void study(){
        System.out.println("student study");
    }
}

class User{
    public static void main(String[] args){
        Person p = new Student(); //向上转型
        p.eat();//person eat
        p.run();//动态绑定，运行p运行类型的方法即Student方法

        Student s = (Student)p;//向下转型
        s.run();//
        s.study();//可以调用子类的特有方法
        s.eat();//可以调用父类的


    }
}