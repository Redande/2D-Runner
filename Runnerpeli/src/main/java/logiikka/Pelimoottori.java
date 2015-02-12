
package logiikka;

import ui.Ui;
/**
 * Ohjelman moottori, joka päivittää ohjelmaa.
 * @author Redande
 */
public class Pelimoottori extends Thread {
    private Ui ui;
    private Sovelluslogiikka logiikka;
    private boolean kaynnissa;
    
    public Pelimoottori(Ui ui, Sovelluslogiikka logiikka) {
        this.ui = ui;
        this.logiikka = logiikka;
        this.kaynnissa = true;
    }
/**
 * Metodi joka päivittää ohjelmaa
 */    
    @Override
    public void run() {
        while (kaynnissa) {
            paivita();
            piirra();
            odota();
        }
    }
    /**
     * Metodi sovelluslogiikan päivittämiselle
     */
    public void paivita() {
        logiikka.kaynnissa();
    }
    /**
     * Metodi käyttöliittymän päivittämiselle
     */
    public void piirra() {
        ui.piirra();
    }
    /**
     * Metodi pelimoottorin sammuttamiselle
     */
    public void sammuta() {
        kaynnissa = false;
    }
/**
 * Apumetodi run-metodille.
 * Metodissa määrätään, kuinka usein ohjelman logiikka ja näkymä päivitetään.
 */    
    public void odota() {
        try {
            Thread.sleep(1000 / 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
