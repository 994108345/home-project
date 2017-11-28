package designpatterns.decorator.Demo.base;

/**
 * Created by wenzailong on 2017/11/16.
 */
/*饮料基类*/
public abstract class Beverage {
    public String description = "";
    public String size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
