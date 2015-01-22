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
public class Este {

    private int x;
    private int y;

    public Este() {
        this.x = 0;
        this.y = 0;
    }

    public void setSijainti(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getSijainti() {
        return new int[]{x, y};
    }
}
