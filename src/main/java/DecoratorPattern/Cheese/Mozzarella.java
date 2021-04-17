package DecoratorPattern.Cheese;

import Bread.Bread;

public class Mozzarella extends Cheese{

    public Mozzarella(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("Mozzarella");
    }

    @Override
    public double cost(){return 1.5 + bread.cost();}

}
