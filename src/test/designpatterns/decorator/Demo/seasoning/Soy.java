package designpatterns.decorator.Demo.seasoning;

import designpatterns.decorator.Demo.base.Beverage;
import designpatterns.decorator.Demo.base.CondimentDecorator;

/**
 * Created by wenzailong on 2017/11/16.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }
    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
