package designpatterns.decorator.Demo.base;

/**
 * Created by wenzailong on 2017/11/16.
 */
/*调料基类*/
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    @Override
    public double cost() {
        return 0;
    }

}
