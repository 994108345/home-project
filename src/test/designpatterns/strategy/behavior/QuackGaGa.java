package designpatterns.strategy.behavior;

import designpatterns.strategy.api.QuackBehavior;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class QuackGaGa implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎的叫");
    }
}
