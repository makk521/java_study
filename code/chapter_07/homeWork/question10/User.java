package code.chapter_07.homeWork.question10;
/*
 * 重写Object equals方法
 */
public class User {
    public static void main(String[] args){
        Doctor doctor1 = new Doctor("ma", 10);
        Doctor doctor2 = new Doctor("ma", 10);
        System.out.println(doctor1.equals(doctor2));
    }
}
