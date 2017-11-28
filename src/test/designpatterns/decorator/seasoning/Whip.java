package designpatterns.decorator.seasoning;

import designpatterns.decorator.base.Beverage;
import designpatterns.decorator.base.CondimentDecorator;

/**
 * Created by wenzailong on 2017/11/16.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
        description = beverage.getDescription() + ",Whip";
    }
    @Override
    public String getDescriprion() {
        this.description = beverage.getDescription() + ",Whip";
        return beverage.getDescription() + ",Whip";
    }
    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
