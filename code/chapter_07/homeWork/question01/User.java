package code.chapter_07.homeWork.question01;

public class User {
    public static void main(String[] args){
        /*
         * 1.定义一个Person类{name,age,job,初始化Person对像数组，有3个person对象，
         * 并按照age从大到小进行排序，提示，使用冒泡排序Homework01.java
         */
        User user = new User();
        Person p[] = new Person[3];
        p[0] = new Person("ma", 1, "ceo");
        p[1] = new Person("zh", 19, "cto");
        p[2] = new Person("ch", 22, "cfo");
        
        user.sort(p);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);  
        }

    }

    public void sort(Person p[]){
        //冒泡排序
        Person tem = new Person(null, 0, null);
        for (int i = 0; i < p.length-1; i++) {
            for(int j = 0; j < p.length-1-i; j++){
                if(p[j].getAge() < p[j+1].getAge()){
                    tem = p[j];
                    p[j] = p[j+1];
                    p[j+1] = tem;
                }
            }
        }
    }
}
