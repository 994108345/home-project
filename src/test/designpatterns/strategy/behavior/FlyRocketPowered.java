package designpatterns.strategy.behavior;

import designpatterns.strategy.api.FlyBehavior;

/**
 * Created by wenzailong on 2017/11/14.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是用火箭推射器飞行的");
    }
}
