import java.util.Scanner;

public class ArithmeticOperator_03 {
    public static void main(String[] args){

        int k = 1;
        int j = ++k;    // 先自增后运算 k = k + 1, j = k
        System.out.println(j);

        int a = 1;
        int b = a++;    // 先运算后自增 j = k, k = k + 1
        System.out.println(b);
    }
}

class FaceTest{
    public static void main(String[] args){
        // 很有意思的面试题
        int i = 1;
        i = i++;
        System.out.println(i);

        int a = 1;
        a = ++a;
        System.out.println(a);
    }
}

class Exercise_01{
    public static void main(String[] args){
        int days = 59;
        int weeks_residue = days / 7;
        int days_residue = days % 7;

    }
}



class InputTest{
    public static void main(String[] args){
        // input anything
        Scanner myScanner = new Scanner(System.in);   // Scanner的对象
        System.out.println("输入名字:");
        String name = myScanner.next();
        System.out.println("输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("名字 = " + name + "年龄 = " + age);

    }
}