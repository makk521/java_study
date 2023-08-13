import java.util.Random;

public class MoraGame {
    /*
     * 有个人Tom设计他的成员变量.成员方法，可以电脑猜拳电脑每次都会随机生成0,1,2 
     * 0表示石头1表示剪刀2表示布并要可以显示Tom的输赢次数（清单）
     */
    public static void main(String[] args){
        Random random = new Random();
        System.out.println(random.nextInt(3));
    }    
}
