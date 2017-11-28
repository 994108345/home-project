package designpatterns.factory.base;

/**
 * Created by wenzailong on 2017/11/20.
 */
public abstract  class PizzaStore {
    SimplePizzaFactory factory;

   /* public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }*/
    public Pizza orderPizza(String  type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
    public abstract Pizza createPizza(String type);
}
