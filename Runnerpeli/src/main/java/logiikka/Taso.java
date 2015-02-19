
package logiikka;

import java.util.ArrayList;
import java.util.List;

/**
 * Luokka, joka sisältää kaikki tason esteet
 * @author Redande
 */
public class Taso {

    private List<Este> esteet;
    private Maali maali;

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
    
    /**
     * Metodi maalin lisäämiselle
     * @param maali 
     */
    public void lisaaMaali(Maali maali) {
        this.maali = maali;
    }
    
    public Maali getMaali() {
        return maali;
    }
}
