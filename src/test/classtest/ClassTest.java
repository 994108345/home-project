package classtest;

import org.junit.Test;

/**
 * Created by wenzailong on 2017/10/30.
 */
public class ClassTest {
    @Test
    public void demo1() {
        Shade circle = new Circle();
    }

    @Test
    public void demo3() {
        /*Apple apple = new Apple();
        this.prin(apple.getClass());*/
        this.prin(Apple.class);
    }
    static void prin(Class cc){
        System.out.println(cc.getName());
        System.out.println(cc.isInstance(cc));
        System.out.println(cc.getSimpleName());
        System.out.println(cc.getCanonicalName());

    }
}
class Apple{
    static{
        System.out.println("I am a apple ");
    }
}

class Orange{
    static{
        System.out.println("I am a oriage ");
    }
}

class Bunada{
    static{
        System.out.println("I am a bunada ");
    }
}


class Shade{}

class Circle extends Shade{}

class Rhomboid extends Shade{}
