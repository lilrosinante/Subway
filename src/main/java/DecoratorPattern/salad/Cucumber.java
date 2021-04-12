package DecoratorPattern.salad;

import Bread.Bread;

public class Cucumber extends Salad{

    public Cucumber(Bread bread) {
        this.bread = bread;
        this.addTopping();
    }

    @Override
    public void addTopping(){bread.getToppings().add("Cucumber");}

}
