package DecoratorPattern;

import Bread.Bread;

public abstract class Topping extends Bread{

    protected Bread bread;

    public void addTopping(){
    }

    public double cost(){
        return 0;
    }
}
