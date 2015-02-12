
package ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import logiikka.Sovelluslogiikka;
/**
 * Ohjelman graafisen puolen keskus
 * @author Redande
 */
public class Ui implements Runnable {
    private JFrame frame;
    private Ikkuna ikkuna;
    private Sovelluslogiikka logiikka;
    
    public Ui(Sovelluslogiikka logiikka) {
        this.logiikka = logiikka;
    }
/**
 * Ohjelman näkymä luodaan tässä metodissa
 */  
    @Override
    public void run() {
        frame = new JFrame("2D-Runner");
        frame.setPreferredSize(new Dimension(900, 600));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        NappaimistonKuuntelija kuuntelija = new NappaimistonKuuntelija(logiikka.getHahmo());
        frame.addKeyListener(kuuntelija);
        
        frame.pack();
        frame.setVisible(true);
    }
/**
 * Luodaan ikkuna, ja annetaan se ruudulle
 * @param container 
 */
    public void luoKomponentit(Container container) {
        this.ikkuna = new Ikkuna(logiikka);
        container.add(ikkuna);
    }
/**
 * Pelimoottoria varten luotu metodi, jossa päivitetään näkymää
 */    
    public void piirra() {
        if (ikkuna == null) {
            return;
        }
        ikkuna.repaint();
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
