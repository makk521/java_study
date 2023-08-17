package code.chapter_07.Override;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person("makk", 18);
        Student s1 = new Student("zhao", 20, 11, 99);
        System.out.println(p1.say());
        System.out.println(s1.say());
    }
}
