package designpatterns.decorator.base;

/**
 * Created by wenzailong on 2017/11/16.
 */
/*饮料基类*/
public abstract class Beverage {
    public String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
