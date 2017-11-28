package designpatterns.factory.base;

import java.util.ArrayList;

/**
 * Created by wenzailong on 2017/11/20.
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList toppings = new ArrayList();
    void prepare(){
        System.out.println("Prepareeing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Addinf toppings:");
        for(int i = 0; i< toppings.size(); i++){
            System.out.println(""+toppings.get(i));
        }
    }
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in oficial PizzaStore box ");
    }
    public String getName(){
        return name;
    }
}
