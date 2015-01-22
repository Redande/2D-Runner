/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnerpeli.runnerpeli.logiikka;

import java.util.*;

/**
 *
 * @author antleino
 */
public class Sovelluslogiikka {

    Taso taso;
    Hahmo hahmo;

    public Sovelluslogiikka() {
        this.taso = new Taso();
        this.hahmo = new Hahmo();
    }
    
    public Taso getTaso() {
        return taso;
    }
    
    public Hahmo getHahmo() {
        return hahmo;
    }

}
