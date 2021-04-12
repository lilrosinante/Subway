package Bread;

public class CheeseOregano extends Bread {

    private String cheeseType;

    public CheeseOregano() {
    }

    public CheeseOregano(String name, double price) {
        this.name = name;
        this.price = price;
        this.cheeseType = "Cheddar";
    }

    public String getCheeseType() {
        return cheeseType;
    }
}
