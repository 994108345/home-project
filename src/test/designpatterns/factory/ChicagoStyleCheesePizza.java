package designpatterns.factory;

import designpatterns.factory.base.Pizza;

/**
 * Created by wenzailong on 2017/11/20.
 */
public class ChicagoStyleCheesePizza  extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Dee[ Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shtrdded Mozzarella Cheese");
    }
    public void cut (){
        System.out.println("Cutting the pizza into square slices");
    }
}
