package code.chapter_07.PolyArray_;

public class PolyArray {
    public static void main(String[] args){
        Person persons[] = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("smith", 19, 30);
        persons[3] = new Teacher("rose", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

        //循环遍历
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());//动态绑定机制,编译类型(Person)有这种方法才可以编译通过

            if(persons[i] instanceof Student){
                Student student = (Student)persons[i];//向下转型
                student.study();
                // ((Student)persons[i]).say();
            }else if(persons[i] instanceof Teacher){
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            }
        }
    }
}
