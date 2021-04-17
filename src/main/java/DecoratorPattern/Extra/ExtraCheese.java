package DecoratorPattern.Extra;

import Bread.Bread;

public class ExtraCheese extends Extra{

    public ExtraCheese(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("ExtraCheese");}

    @Override
    public double cost(){return 0.5;}

}
