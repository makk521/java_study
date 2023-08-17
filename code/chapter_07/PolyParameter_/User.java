package code.chapter_07.PolyParameter_;

public class User {
    public static void main(String[] args){
        Worker tom = new Worker("tom", 2500);
        Manager jack = new Manager("jack", 2500, 20000);
        User user = new User();
        user.showEmpAnnual(tom);
        user.showEmpAnnual(jack);
        System.out.println("----------------------");
        user.testWork(jack);
        user.testWork(tom);
    }
    public void showEmpAnnual(Employee e){
        //实现获取任何员工对象的年工资，并在main方法中调用该方法

        System.out.println(e.getAnnual()); //会动态绑定
    }

    public void testWork(Employee e){
        //想调用子类特有方法时才判断；上面如果都有getAnnual方法则直接调用即可因为有动态绑定机。
        if(e instanceof Worker){
            ((Worker)e).work();//向下转型
        }else if(e instanceof Manager){
            ((Manager)e).manage();
        }
    }
}
