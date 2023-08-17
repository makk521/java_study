package code.chapter_07.extend_2;

public class Pc extends Computer{//只写一个会报错原因是定义一个Pc时会调用Computer的无参构造器，但没有了
    String brand;

    public Pc(String cpu, int memory, String brand) {
        super(cpu, memory);
        this.brand = brand;
    }

    public String getPcDetails(){
        return getDetails() + "brand = " + this.brand;
    }
}
