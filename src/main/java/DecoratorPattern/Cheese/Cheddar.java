package DecoratorPattern.Cheese;

import Bread.Bread;

public class Cheddar extends Cheese {

    public Cheddar(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("Cheddar");}

    @Override
    public double cost(){return 1;}

}
