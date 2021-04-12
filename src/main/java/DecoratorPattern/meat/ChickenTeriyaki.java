package DecoratorPattern.meat;

import Bread.Bread;

public class ChickenTeriyaki extends Meat{

    public ChickenTeriyaki(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("ChickenTeriyaki");}

}
