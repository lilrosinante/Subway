package Bread;

import java.util.ArrayList;

public abstract class Bread {

    protected String name;
    protected double price;
    private ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() { return price; }

    public double cost() {return 0;}

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
}
