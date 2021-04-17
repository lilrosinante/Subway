import Bread.Bread;
import ENUM.BreadType;
import Bread.CheeseOregano;
import Bread.HoneyOat;

public class BreadFactory {

    public Bread chooseBread(BreadType type) {

        Bread bread;

        if(type == BreadType.HONEYOAT){
            bread = new HoneyOat("Honey Oat Bread");
        } else if(type == BreadType.CHEESEOREGANO){
            bread = new CheeseOregano("Cheese Oregano");
        } else {
            bread = null;
        }
        return bread;
    }

}
