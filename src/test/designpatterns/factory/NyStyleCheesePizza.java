package designpatterns.factory;

import designpatterns.factory.base.Pizza;

/**
 * Created by wenzailong on 2017/11/20.
 */
public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza(){
        name = "NY Style Sauce anf Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano cheese");
    }
}
