package code.chapter_07.Equal_;

public class EqualExercise1 {
    public static void main(String[] args){
        Person p1 = new Person("jack", 18, '男');
        Person p2 = new Person("jack", 18, '男');
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}

class Person{
    private String name;
    private int age;
    private char gender;
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person)obj;//向下转型需要obj的各个属性
            return name.equals(p.name) && age == p.age && gender == p.gender;
        }else{
            return false;
        }
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}