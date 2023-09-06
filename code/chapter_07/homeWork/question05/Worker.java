package code.chapter_07.homeWork.question05;

public class Worker extends Employee{
    //属性
    public Worker(String name, double salary){
        super(name, salary);
    }

    public void showSalary(){
        System.out.print("工人");
        super.showSalary();
    }
}
