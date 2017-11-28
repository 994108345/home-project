package designpatterns.decorator.seasoning;

import designpatterns.decorator.base.Beverage;
import designpatterns.decorator.base.CondimentDecorator;

/**
 * Created by wenzailong on 2017/11/16.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
        description = beverage.getDescription() + ",Mocha";
    }
    @Override
    public String getDescriprion() {
        this.description = beverage.getDescription() + ",Mocha";
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
