package code.chapter_07.Poly_;

public class Animal {
    String propertyOver = "Animal property";
    String name = "动物";
    int age = 10;
    public void sleep(){
        System.out.println("睡");
    }

    public void eat(){
        System.out.println("吃");
    }

    public void showInfo(){
        System.out.println("name = " + this.name + " age = " + this.age);
    }
    
}
