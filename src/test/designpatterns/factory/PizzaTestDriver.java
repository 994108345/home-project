package designpatterns.factory;

import designpatterns.factory.base.Pizza;
import designpatterns.factory.base.PizzaStore;

/**
 * Created by wenzailong on 2017/11/21.
 */
public class PizzaTestDriver {
    public static void main(String[] args){
        PizzaStore nyStore = new NYSykePizzaStore();
        PizzaStore chicagoStore = new ChicagostulePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a" + pizza.getName() + "\n");
    }
}
