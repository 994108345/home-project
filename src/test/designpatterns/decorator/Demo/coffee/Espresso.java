package designpatterns.decorator.Demo.coffee;

import designpatterns.decorator.Demo.base.Beverage;

/**
 * Created by wenzailong on 2017/11/16.
 */
/*浓缩饮料*/
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    public String getDescription(){
        return description;
    }
}
