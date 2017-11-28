package designpatterns.decorator.seasoning;

import designpatterns.decorator.base.Beverage;
import designpatterns.decorator.base.CondimentDecorator;

/**
 * Created by wenzailong on 2017/11/16.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
        description = beverage.getDescription() + ",Soy";
    }
    @Override
    public String getDescriprion() {
        this.description = beverage.getDescription() + ",Soy";
        return beverage.getDescription() + ",Soy";
    }
    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
