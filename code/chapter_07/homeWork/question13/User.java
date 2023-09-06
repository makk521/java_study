package code.chapter_07.homeWork.question13;

public class User {
    public static void main(String[] args){
        User user = new User();

        Student s = new Student("ma", '男', 18, "SA12");
        s.showInfo();

        Teacher t = new Teacher("ka", '女', 12, 1);
        t.showInfo();

        Person p[] = new Person[4];
        p[0] = new Student("ma", '男', 18, "SA2");
        p[1] = new Student("zh", '男', 20, "SA1");
        p[2] = new Teacher("ka", '女', 17, 1);
        p[3] = new Teacher("qi", '女', 30, 3);
        user.sort(p);
        System.out.println("排序后：");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

        System.out.println("=========函数调用===========");
        for (int i = 0; i < p.length; i++) {
            user.callFunction(p[i]);
        }
    }

    public void sort(Person p[]){
        /*
         * 定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序
         */
        Person tem = null;
        for (int i = 0; i < p.length-1; i++) {
            for(int j=0; j < p.length -1 -i; j++){
                if(p[j].getAge() < p[j+1].getAge()){
                    tem = p[j];
                    p[j] = p[j+1];
                    p[j+1] = tem;
                }
            }
        }

    }

    public void callFunction(Person p){
        /*
         * (8)；定义方法，形参为Person类型，功能：调用学生的study或教师的 teach方法
         */
        if(p instanceof Student){
            ((Student)p).study();
        }else if(p instanceof Teacher){
            ((Teacher)p).teach();
        }else{
            return;
        }
    }
}
