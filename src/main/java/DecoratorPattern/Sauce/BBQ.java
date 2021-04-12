package DecoratorPattern.Sauce;

import Bread.Bread;

public class BBQ extends Sauce{

    public BBQ(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("BBQ Sauce");}

}
