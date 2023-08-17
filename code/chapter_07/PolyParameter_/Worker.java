package code.chapter_07.PolyParameter_;

// import javafx.concurrent.Worker;

public class Worker extends Employee{
    public Worker(String name, int salary){
        super(name, salary);
    }

    public void work(){
        System.out.println(getName() + "在当牛马");
    }

    public double getAnnual(){//即使重写也是和父类一样的方法
        return super.getAnnual();
    }
}
