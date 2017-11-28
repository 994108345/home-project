package designpatterns.factory;

import designpatterns.factory.base.Pizza;
import designpatterns.factory.base.PizzaStore;

/**
 * Created by wenzailong on 2017/11/20.
 */
public class NYSykePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza =null;
        if(type.equals("cheese")){
            pizza = new NyStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new  NyStylePepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new NyStyleClamPizza();
        }else if (type.equals("verggie")){
            pizza = new NyStyleVeggiePizza();
        }
        return pizza;
    }

}
