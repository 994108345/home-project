package designpatterns.decorator;

import designpatterns.decorator.base.Beverage;
import designpatterns.decorator.coffee.Espresso;
import designpatterns.decorator.coffee.DarkRoast;
import designpatterns.decorator.coffee.HouseBlend;
import designpatterns.decorator.seasoning.Mocha;
import designpatterns.decorator.seasoning.Whip;

/**
 * Created by wenzailong on 2017/11/16.
 */
/*提供咖啡（运行类）*/
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+ "$" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
    }
}
