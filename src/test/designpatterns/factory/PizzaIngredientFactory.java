package designpatterns.factory;

import designpatterns.factory.ingredient.*;

/**
 * Created by wenzailong on 2017/11/21.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
