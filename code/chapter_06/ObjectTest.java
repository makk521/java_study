public class ObjectTest{
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.name = "maka";
        cat1.age = 18;
        cat1.color = "green";
        System.out.print(cat1.name);
    }
}

class Cat{
    String name;
    int age;
    String color;
}
/****************方法的定义 *********************/
class ObjectTest1{
    public static void main(String[] args){
        Person ma = new Person();
        ma.speak();
        int sum = ma.cal01(1, 2);
        System.out.println(sum);
    }
}

class Person{
    String name;
    int age;
    /*public  方法是公开的
     * void   没有返回值
     * speak() speak是方法名，()形参列表
     */
    public void speak(){
        System.out.println("我是好人！");
    }
    // 添加ca101成员方法，可以计算从startNum 到 endNum 的结果
    public int cal01(int startNum,int endNum){
        int sum = 0;
        for(int i=startNum; i<=endNum; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        return sum;
    }
}

class ObjectTest2{
    public static void main(String[] args){
        int map[][] = {{1,2,3},{1,2}};
        MyTools myTools = new MyTools();
        myTools.mapPrint(map);

    }
}

class MyTools{
    public void mapPrint(int map[][]){
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.println(map[i][j]);
            }
            
        }
    }
}

