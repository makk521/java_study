public class Recursion {
    public static void main(String[] args){
        MyToolsRecursion mytools = new MyToolsRecursion();
        int result = mytools.monkeyeat(10, 1);
        System.out.println(result);
    }
}

class MyToolsRecursion{
    public int factorial(int n){
        // 阶乘
        if(n==1){
            return 1;
        }else{
            return factorial(n-1) * n;
        }
    }

    public int fibonacci(int n){
        // 斐波那契数列, 1,1,2,3,5.......,n>0
        if(n==1 || n==2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n=2);
        }
    }

    public int monkeyeat(int day,int remaning){
        /*猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，
        并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。
        当到第10天时，想再吃时（即还没吃）发现只有1个桃子了。问题：最初共多少个桃子？ */

        /*
        思路分析
        前一天桃子数 = （今天剩的+1）*2
         */

        if(day==1){
            return remaning;
        }else{
            remaning = (remaning+1)*2;
            return monkeyeat(day-1, remaning);
        }
    }

}