
package Main;

import javax.swing.SwingUtilities;
import logiikka.Pelimoottori;
import logiikka.Sovelluslogiikka;
import ui.Ui;
/**
 * Mainissa käynnistetään ohjelma
 * @author Redande
 */
public class Main {
/**
 * Ohjelma käynnistetään main-metodissa
 * @param args 
 */
    public static void main(String[] args) {
        Sovelluslogiikka logiikka = new Sovelluslogiikka();
        Ui ui = new Ui(logiikka);
        
        SwingUtilities.invokeLater(ui);
        
//        Pelimoottori moottori = new Pelimoottori(ui, logiikka);
        
//        moottori.start();
    }
}
