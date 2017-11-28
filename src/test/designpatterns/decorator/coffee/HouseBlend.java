package designpatterns.decorator.coffee;

import designpatterns.decorator.base.Beverage;

/**
 * Created by wenzailong on 2017/11/16.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }

    public String getDescription(){
        return description;
    }
}
