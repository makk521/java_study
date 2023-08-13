public class MethodExercise {
    public static void main(String[] args){
        double Scores[] = {1, 2, 3};
        AA aa = new AA();
        String result = aa.showScore("makaka", Scores);
        System.out.println(result);
    }
}

class AA{
    public boolean isOdd(int num){
        //编写类AA,有一个方法：判断一个数是奇数odd还是偶数，返回boo1lean
        return num % 2 != 0 ? true : false;
    }

    public String showScore(String name, double... scores){
        //返回姓名与成绩和
        double totalSocres = 0;
        for(int i=0; i<scores.length; i++){
            totalSocres += scores[i];
        }
        return name + "有" + scores.length + "门课总成绩为=" + totalSocres;
    }
}

