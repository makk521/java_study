package code.chapter_07.Poly_;

public class User {
    public static void main(String[] args){
        //向上转型：父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型();
        Animal animal = new Cat();//看编译类型的属性
        animal.eat(); //子类的方法
        animal.showInfo();//animal的方法
        System.out.println(animal.propertyOver);


        //向下转型，调用Cat的catchMouse方法，编译类型、运行类型都是Cat
        Cat cat = (Cat) animal;//2）要求父类的引用必须指向的是当前目标类型的对象：animal原先指向的就是Cat,此后animal与cat都指向一个cat对象，
                                //只是一个可以调用子类特有方法(cat)一个不可以

        cat.catchMouse();

    }
}
