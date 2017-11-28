package designpatterns.strategy;

import designpatterns.strategy.behavior.FlyNoWay;
import designpatterns.strategy.behavior.QuackGaGa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class HomeDuclk extends Duck {
    List list = new ArrayList();
    HomeDuclk(){
        quackBehavior = new QuackGaGa();
        flyBehavior = new FlyNoWay();
    }

    public void isEat(){
        System.out.println("可以吃");
    }

    @Override
    public void display() {
        System.out.println("i am a HmeDuck");
    }

    @Override
    public void swim() {
        super.swim();
    }
}
