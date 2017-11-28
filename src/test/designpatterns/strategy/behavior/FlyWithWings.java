package designpatterns.strategy.behavior;

import designpatterns.strategy.api.FlyBehavior;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("带着翅膀可以飞行");
    }
}
