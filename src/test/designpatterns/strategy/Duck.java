package designpatterns.strategy;

import designpatterns.strategy.api.FlyBehavior;
import designpatterns.strategy.api.QuackBehavior;

/**
 * Created by wenzailong on 2017/11/14.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    void performFly(){
        flyBehavior.fly();
    }
    void performQuack(){
      quackBehavior.quack();
    }

    public abstract  void display();

    public void swim(){
        System.out.println("All ducks fliat ,even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

}
