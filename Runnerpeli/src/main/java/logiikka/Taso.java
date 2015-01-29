
package logiikka;

import java.util.ArrayList;
import java.util.List;

public class Taso {

    List<Este> esteet;

    public Taso() {
        this.esteet = new ArrayList<Este>();
    }
    
    public void lisaaEste(Este este) {
        esteet.add(este);
    }
    
    public List<Este> getTasonEsteet() {
        return esteet;
    }
}
