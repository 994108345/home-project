package designpatterns.factory.base;

import designpatterns.factory.pizza.CheesePizza;
import designpatterns.factory.pizza.ClamPizza;
import designpatterns.factory.pizza.PepperoniPizza;
import designpatterns.factory.pizza.VeggiePizza;

/**
 * Created by wenzailong on 2017/11/20.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if (type.equals("verggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
