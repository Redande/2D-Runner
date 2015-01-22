/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnerpeli.runnerpeli.logiikka;

import java.util.*;

/**
 *
 * @author Redande
 */
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
