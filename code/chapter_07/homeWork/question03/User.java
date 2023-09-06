package code.chapter_07.homeWork.question03;

public class User {
    public static void main(String[] args){
        Teacher p = new Professor("ma", 0, "副教授", 10000);
        p.introduce();
        //向下转型
        //当子类中有和父类中的成员（属性和方法）重名时，为了访问父类的成员，必须通过super。如果没有重名，使用super、.this、直接访问是一样的效果！
        p = new Lecturer("zh", 18, "讲师", 10000);
        p.introduce();
    }
}
