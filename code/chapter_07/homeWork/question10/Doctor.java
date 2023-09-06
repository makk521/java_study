package code.chapter_07.homeWork.question10;

import javax.print.Doc;

/*
 * 重写Object equals方法
 */
public class Doctor {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean euqals(Object obj){
        //过关斩将
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Doctor)){//不是Doctor或其子类
            return false;
        }
        Doctor doctor = (Doctor)obj;
        return this.age == doctor.getAge() && this.name.equals(doctor.getName());
    }

}
