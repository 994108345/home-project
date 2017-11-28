package designpatterns.factory;

import designpatterns.factory.base.Pizza;
import designpatterns.factory.base.PizzaStore;

/**
 * Created by wenzailong on 2017/11/20.
 */
public class ChicagostulePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza =null;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new  ChicagoStylePepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        }else if (type.equals("verggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
