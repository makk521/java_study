import java.util.Scanner;

public class LogicControl_04 {
    public static void main(String[] args){
        System.out.println("请输入年龄：");
        Scanner myScanner = new Scanner(System.in);
        int age = myScanner.nextInt();
        if(age >= 18){
            System.out.println("成年了");
        }
        else{
            System.out.println("未成年");
        }
        myScanner.close();
    }
}

class SwitchDetial{
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            System.out.println("hello world!");
        }
    }
}


class WhileTest{
    public static void main(String[] args){
        int i = 1;
        while(i <= 10){
            System.out.println("你好" + i);
            i++;
        }
    }
}

class NineChart{
    public static void main(String[] args){
        for(int j = 1; j <= 9; j++){
            for(int i = 1; i <= j; i++){
                System.out.print(i + " * " + j + " = " + i*j + "\t");
            }
            System.out.println();
        }

    }
}

// class Towel{
//     public static void main(String[] args){
//         int totalLevel = 5;
//         for(int i = 1;i <= totalLevel;i++){
//             if(i == 1){
//                 System.out.println(" " * );
//             }
//         }
//     }
// }

class CheckUser{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int count = 3;
        String name = "";
        String user = "makaka";
        for(;count > 0;count--){
            System.out.println("输入用户名:");
            name = myScanner.next();
            if(name.equals(user)){
                System.out.println("输入成功");
                break;
            }
        }
        myScanner.close();
    }
}

class ExerciseCash{
    public static void main(String[] args){
        double cash = 100000;
        double rate = 0.95;
        double consume = 1000;
        int num = 0;
        while(cash >= consume){
            if(cash > 50000){
                cash = cash * rate;
                num++;
            }
            else if(cash < 50000 && cash > 1000){
                cash -= consume;
                num++;
            }
        }
        System.out.println("Total rooad num:" + num);
    }
}

class ExerciseSum{
    public static void main(String[] args){
        double up = 1, down = 1, sum = 0;
        while(down <= 100){
            if(down % 2 != 0){
                sum += up/down;
            }else{
                sum -= up/down;
            }
            down++;
        }
        System.out.println("The sum is " + sum);
    }
}