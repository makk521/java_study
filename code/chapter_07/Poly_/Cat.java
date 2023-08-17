package code.chapter_07.Poly_;

public class Cat extends Animal{
    String propertyOver = "Cat property";
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){//cat特有方法
        System.out.println("猫抓老鼠");
    }
}
