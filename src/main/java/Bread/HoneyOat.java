package Bread;

public class HoneyOat extends Bread {

    private String oatType;

    public HoneyOat() {
    }

    public HoneyOat(String name, double price){
        this.oatType = "honeyOat";
        this.name = name;
        this.price = price;
    }

    public String getOatType() {
        return oatType;
    }
}
