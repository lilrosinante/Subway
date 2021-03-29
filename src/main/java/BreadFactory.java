import Bread.Bread;
import ENUM.BreadType;
import Bread.CheeseOregano;
import Bread.HoneyOat;

public class BreadFactory {

    public Bread chooseBread(BreadType type) {

        Bread bread;

        if(type == BreadType.HONEYOAT){
            bread = new HoneyOat();
        } else if(type == BreadType.CHEESEOREGANO){
            bread = new CheeseOregano();
        } else {
            bread = null;
        }
        return bread;
    }

}
