package designpatterns.strategy;

import designpatterns.strategy.behavior.FlyNoWay;
import designpatterns.strategy.behavior.QuackGaGa;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackGaGa();
    }
    @Override
    public void display() {
        System.out.println(" 我是模型鸭");
    }
}
