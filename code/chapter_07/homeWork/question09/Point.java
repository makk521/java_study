package code.chapter_07.homeWork.question09;
/*
 * 9.设计一个Point类，其x和y坐标可以通过构造器提供。提供一个子类LabeledPoint,
 * 其构造器接授一个标签值和x,y坐标，比如new LabeledPoint(“Black”,1929,230.07),写出对应的构造器即可HomeworkO9.java
 */
public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

}
