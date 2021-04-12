package DecoratorPattern.Sauce;

import Bread.Bread;

public class Chipotle extends Sauce {

    public Chipotle(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("Chipotle Sauce");}
}
