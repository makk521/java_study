public class ThisTest {
    public static void main(String[] args){
        
    }
}


class Dog{
    String name;
    int age;
    //第一个无参构造器：利用构造器设置所有人的ag属性初始值都为18
    public Dog(){
        age = 18;
    }
    //第二个带Name和pAge两个参数的构造器
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
}