public class Constructor {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("x", 3);
        System.out.println(d1.age + d2.name + d2.age);
    }
}

class Person1 {
    String name; //默认null
    int age; // 默认0
    //第一个构造器
    public Person1(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
    //第二个构造器
    public Person1(String pName){
        name = pName;
    }

    // 
}

class Dog{
    String name;
    int age;
    //第一个无参构造器：利用构造器设置所有人的ag属性初始值都为18
    public Dog(){
        age = 18;
    }
    //第二个带Name和pAge两个参数的构造器
    public Dog(String dName, int dAge){
        name = dName;
        age = dAge;
    }
}