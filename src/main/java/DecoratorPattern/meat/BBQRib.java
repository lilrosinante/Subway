package DecoratorPattern.meat;

import Bread.Bread;

public class BBQRib extends Meat{

    public BBQRib(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("BBQRib");
    }

    @Override
    public double cost(){return 5.0 + bread.cost();}

}
