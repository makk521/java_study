/*
 * 整体格式为 Homework_06中的main方法调用所有Exe方法（对应一个题目），每个Exe中的方法调用题目中对应的类
 */
import java.lang.Math;
public class Homework_06 {
    public static void main(String[] args){
        AllControl_06 mycontrol = new AllControl_06();
        mycontrol.HomeworkTools_06_A01_Exe();
        mycontrol.HomeworkTools_06_A02_Exe();
        mycontrol.Homework_06_Book_Exe();
        mycontrol.Homework_06_A03_Exe();
        mycontrol.Homework_06_Circle_Exe();
        mycontrol.HomeworkTools_06_Dog_Exe();
        mycontrol.HomeworkTools_06_PassObject_Exe();
    }
}

class AllControl_06{
    //控制所有作业题的调用并封装
    public void HomeworkTools_06_A01_Exe(){
        System.out.println("-----------题目一-----------");
        //题目一调用
        double nums[] = {3, 4, 2, 5};
        HomeworkTools_06_A01 a01 = new HomeworkTools_06_A01();
        a01.max(nums);
        System.out.println("A01数组中最大值为:" + a01.max(nums));
    }

    public void HomeworkTools_06_A02_Exe(){
        System.out.println("-----------题目二-----------");
        String arr[] = {"maka", "cha", "zhou"};
        String target = "cha";
        HomeworkTools_06_A02 a02 = new HomeworkTools_06_A02();
        int result = a02.find(target, arr);
        System.out.println("Homework2元素查找结果为" + target + "在arr的第" + result + "个");
    }

    public void Homework_06_Book_Exe(){
        System.out.println("-----------题目三-----------");
        HomeworkTools_06_Book book = new HomeworkTools_06_Book("makaka",180);
        System.out.println(book.price);
        book.updatePrice();
        System.out.println(book.price);

    }

    public void Homework_06_A03_Exe(){
        System.out.println("-----------题目四-----------");
        int arr[] = {1, 2, 3};
        HomeworkTools_06_A03 a03 = new HomeworkTools_06_A03();
        int copy[] = a03.copyArr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(copy[i] + "\t");
        }
    }

    public void Homework_06_Circle_Exe(){
        System.out.println("-----------题目五-----------");
        double radius = 1;
        double result[] = new double[2];
        HomeworkTools_06_Circle circle = new HomeworkTools_06_Circle(radius);
        result = circle.caculate();
        System.out.println("面积为:" + result[0] + "周长为:" + result[1]);
    }

    public void HomeworkTools_06_Cale_Exe(){
        System.out.println("-----------题目五-----------");
        double para1 = 1;
        double para2 = 2;
        HomeworkTools_06_Cale cale = new HomeworkTools_06_Cale(para1, para2);
        System.out.println("add");

    }

    public void HomeworkTools_06_Dog_Exe(){
        System.out.println("-----------题目六与十一-----------");
        HomeworkTools_06_Dog dog = new HomeworkTools_06_Dog("二蛋", "绿色", 18);
        dog.show();
        double result = dog.method(dog.method(10.0, 20.0), 100);
        System.out.println(result);
    }

    public void HomeworkTools_06_PassObject_Exe(){
        System.out.println("-----------题目十三-----------");
        HomeworkTools_06_Circle circlePass = new HomeworkTools_06_Circle(2);
        HomeworkTools_06_PassObject passObject = new HomeworkTools_06_PassObject();
        passObject.printAreas(circlePass, 5);
    }
}

class HomeworkTools_06_A01{
    public double max(double... nums){
        //编写类A01,定义方法max,实现求某个double数组的最大值，并返回
        double maxNum = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > maxNum){
                maxNum = nums[i];
            }
        }
        return maxNum;
    }
}

class HomeworkTools_06_A02{
    public int find(String eleTarget, String... str){
        //2.编写类A02,定义方法find,实现查找某字符串数组中的元素查找，并返回索引；如果找不到，返回-1.
        for(int i=0; i<str.length; i++){
            if(eleTarget.equals(str[i])){
                return i;
            }
        }
        return -1;
    }
}

class HomeworkTools_06_Book{
    // 编写类Book,定义方法updatePrice,实现更改某本书的价格具体：如果价格>150，则更改为150，如果价格>100，更改为100，否则不变
    String name;
    double price;
    public HomeworkTools_06_Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void updatePrice(){
        if(this.price > 150){
            this.price = 150;
        }else if(this.price > 100 && this.price <= 150){
            this.price = 100;
        }
    }
}

class HomeworkTools_06_A03{
    //编写类A03,实现数组的复制功能copyArr,输入旧数组，返回一个新数组，元素和旧数组一样.
    public int[] copyArr(int arr[]){
        int copy[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            copy[i] = arr[i];
        } 
        return copy;
    }

}

class HomeworkTools_06_Circle{
    double radius;
    //定义一个圆类circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
    public HomeworkTools_06_Circle(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double[] caculate(){
        double result[] = new double[2];
        result[0] = Math.PI * this.radius * this.radius;
        result[1] = 2 * Math.PI * this.radius;
        return result;
    }
}

class HomeworkTools_06_Cale{
    double para1, para2;

    public HomeworkTools_06_Cale(double para1, double para2){
        this.para1 = para1;
        this.para2 = para2;
    }
    public double numAdd(){
        return this.para1 + this.para2;
    }
    public double numSubtract(){
        return this.para1 - this.para2;
    }
    public double numMultiply(){
        return this.para1 * this.para2;
    }
    public double numDivide(){
        if(this.para2 == 0){
            System.out.println("除数为0无意义!");
            return 0;
        }else{
            return this.para1 / this.para2;
        }
    }
}

class HomeworkTools_06_Dog{
    //设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show显示其信息并创建对象，进行测试
    String name;
    String color;
    int age;
    public HomeworkTools_06_Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show(){
        System.out.println("姓名：" + this.name + "颜色：" + this.color + "年龄：" + this.age);
    }

    public double method(double para1, double para2){
        return para1 + para2;
    }
}

class HomeworkTools_06_Employee{
    /*
     * 12.创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），
     * 提供3个构造方法，可以初始化(1)（名字，性别，年龄，职位，薪水)，
     * (2)（名字，性别，年龄）(3)(职位，薪水)，要求充分复用构造器
     */
    String name;
    String gender;
    int age;
    String level;
    double salary;
    public HomeworkTools_06_Employee(String level, double salary){
        this.level = level;
        this.salary = salary;
    }
    public HomeworkTools_06_Employee(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public HomeworkTools_06_Employee(String name, String gender, int age, String level, double salary){
        this(name, gender, age);
        this.level = level;
        this.salary = salary;
    }
}

class HomeworkTools_06_PassObject{
    public void printAreas(HomeworkTools_06_Circle c, int times){
        for(int i=0; i<times; i++){
            c.radius = i; //重点，从函数内改变对象的属性
            System.out.println(c.radius + "\t" + c.findArea());
        }
    }
}