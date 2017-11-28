package designpatterns.decorator.base;

/**
 * Created by wenzailong on 2017/11/16.
 */
/*调料基类*/
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescriprion();
    @Override
    public double cost() {
        return 0;
    }

}
