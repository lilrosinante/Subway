package DecoratorPattern.Extra;

import Bread.Bread;

public class ExtraBacon extends Extra{

    public ExtraBacon(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("ExtraBacon");
    }

    @Override
    public double cost(){return 1 + bread.cost();}

}
