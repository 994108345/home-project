package designpatterns.strategy.MyDemo;

/**
 * Created by wenzailong on 2017/11/15.
 */
public abstract  class Character {

    void fight(){
        System.out.println("攻击");
    };
    void noFight(){
        System.out.println("不会攻击");
    }

     abstract void  display();
}
