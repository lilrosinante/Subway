package DecoratorPattern.salad;

import Bread.Bread;

public class Pepper extends Salad {

    public Pepper(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("Pepper");
    }

    @Override
    public double cost(){return 0.5 + bread.cost();}
}
