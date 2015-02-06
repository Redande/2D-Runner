
package logiikka;

import java.util.ArrayList;
import java.util.List;
/**
 * Luokka, joka sisältää kaikki tason esteet
 * @author Redande
 */
public class Taso {

    private List<Este> esteet;

    public Taso() {
        this.esteet = new ArrayList<Este>();
    }
/**
 * Metodi esteen lisäämiseen tasoon
 * @param este 
 */
    public void lisaaEste(Este este) {
        esteet.add(este);
    }
    
    public List<Este> getTasonEsteet() {
        return esteet;
    }
}
