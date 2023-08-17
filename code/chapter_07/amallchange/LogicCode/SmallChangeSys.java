package code.chapter_07.amallchange.LogicCode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SmallChangeSys {
    //零钱通项目
    //1.显示菜单
    //2.零钱通明细
    //3。收益入账
    //4。消费
    //5.退出
    //6.金额校验(编程思想：找出不正确的给出提示然后break)
    public static void main(String[] args){
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2.完成零钱通明细
        String details = "----------------零钱通明细----------------";

        //3.收益入账
        double money = 0;
        double balance = 0;
        Date date = null;//date 是 java.util.Date 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化

        //4.消费
        String consumeCase = "";

        do{
            System.out.println("================零钱通菜单================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退   出");

            System.out.println("请选择(1-4): ");
            key = scanner.next();

            switch(key){
                case "1":
                    // System.out.println("\1 零钱通明细");
                    System.out.println(details);
                    break;
                case "2":
                    // System.out.println("2 收益入账");
                    System.out.print("请输入收入入账金额：");
                    //不正确的情况，提示后退出
                    money = scanner.nextDouble();
                    if(money <= 0){
                        System.out.println("收益入账金额应大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();

                    //拼接
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    // System.out.println("3 消费");
                    System.out.print("请输入消费金额：");
                    money = scanner.nextDouble();
                    if(money <= 0 || money > balance){
                        System.out.println("你的消费金额应在0-" + balance);
                        break;
                    }
                    System.out.print("请输入消费原因：");
                    consumeCase = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + consumeCase + "\t\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice = "";
                    System.out.println("确定退出吗?y/n");
                    //循环扁平化！
                    while(true){
                        
                        choice = scanner.next();
                        if(choice.equals("y") || choice.equals("n")){
                            break;
                        }
                        System.out.print("输入错误强重新输入(y/n):");
                    }
                    //只能是y/n
                    if(choice.equals("y")){
                        loop = false;
                    }

                    System.out.println("4 退出");
                    loop = false;
                    break;
                default:
                    System.out.println("选择有误重新选择");
                }

        }while(loop);

        System.out.println("---------退出零钱通项目--------");
    }
}
