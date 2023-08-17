package code.chapter_07.com.use;

import code.chapter_07.com.tom.Dog;
import code.chapter_07.com.jack.Dog; //必须有
public class test {
    public static void main(String[] args){
        Dog dog = new Dog();//默认Dog是第一个(tom)
        code.chapter_07.com.jack.Dog dog1 = new code.chapter_07.com.jack.Dog();
        System.out.println(dog);//code.chapter_07.com.tom.Dog@15db9742
        System.out.println(dog1);//code.chapter_07.com.jack.Dog@6d06d69c
    }
}
