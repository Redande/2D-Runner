
package ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import logiikka.Hahmo;
/**
 * Luokka hahmon hyppäämistä varten.
 * @author Redande
 */
public class NappaimistonKuuntelija implements KeyListener {
    
    private Hahmo hahmo;
    
    public NappaimistonKuuntelija(Hahmo hahmo) {
        this.hahmo = hahmo;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
/**
 * Jos painetaan välilyöntiä, hahmo hyppää
 * @param e 
 */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            hahmo.hyppaa();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
