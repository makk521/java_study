import java.util.Random;
import java.util.Scanner;

public class MoraGame {
    /*
     * 有个人Tom设计他的成员变量.成员方法，可以电脑猜拳电脑每次都会随机生成0,1,2 
     * 0表示石头1表示剪刀2表示布并要可以显示Tom的输赢次数（清单）
     */
    public static void main(String[] args){
        int aiNum;
        int tomNum;
        String moralList[] = {"石头", "剪刀", "布"};
        int winTime[] = new int[3];//输 赢 平
        Random random = new Random();
        Scanner myScanner = new Scanner(System.in);

        for(int i=0; i<3; i++){
            aiNum = aiMora(random);
            tomNum = tomMora(myScanner);
            String result = comResult(tomNum, aiNum);
            if(result.equals("平局")){
                winTime[2]++;
            }else if(result.equals("赢了")){
                winTime[1]++;
            }else{
                winTime[0]++;
            }
            System.out.println("Tom出:" + moralList[tomNum] + "\t" + "电脑出:" + moralList[aiNum] + "\t" + "结果:" + result);
        }
        printResult(winTime);
    }    

    public static int aiMora(Random random){
        int aiNum = random.nextInt(3);
        // System.out.println("aiNum:" + aiNum);
        return aiNum;
    }

    public static int tomMora(Scanner myScanner){
        System.out.print("请输入猜拳(0->石头  1->剪刀  2->布):");
        return myScanner.nextInt();
    }

    public static String comResult(int tomNum, int aiNum){
        if(tomNum == aiNum){
            return "平局";
        }else if((tomNum == 0 && aiNum == 1) || (tomNum == 1 && aiNum ==2) || (tomNum == 2 && aiNum == 0)){
            return "赢了";
        }else{
            return "输了";
        }
    }

    public static void printResult(int winTime[]){
        System.out.println("-----------------3次结果----------------");
        System.out.println("输次数:" + winTime[0] + "\t" + "赢次数" + winTime[1] + "\t" + "平局次数" + winTime[2] + "\t");
        
    }

}



