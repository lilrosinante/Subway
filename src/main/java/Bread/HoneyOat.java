package Bread;

public class HoneyOat extends Bread {

    private String oatType;

    public HoneyOat() {
    }

    public HoneyOat(String name){
        this.oatType = "HoneyOat";
        this.name = name;
    }

    @Override
    public double cost(){return 2.5;}

    public String getOatType() {
        return oatType;
    }
}
