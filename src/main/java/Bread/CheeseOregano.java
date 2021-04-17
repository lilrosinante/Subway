package Bread;

public class CheeseOregano extends Bread {

    private String cheeseType;

    public CheeseOregano() {
    }

    public CheeseOregano(String name) {
        this.name = name;
        this.cheeseType = "Cheddar";
    }

    @Override
    public double cost(){return 3;}

    public String getCheeseType() {
        return cheeseType;
    }
}
