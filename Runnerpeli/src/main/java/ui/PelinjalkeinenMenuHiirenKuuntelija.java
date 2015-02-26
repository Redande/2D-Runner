package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import logiikka.Pelimoottori;
import logiikka.Sovelluslogiikka;

class PelinjalkeinenMenuHiirenKuuntelija implements ActionListener {
    private JButton uusiPeli;
    private JButton takaisinMenuun;
    private JButton suljeOhjelma;
    private Ui ui;
    private Pelimoottori moottori;

    public PelinjalkeinenMenuHiirenKuuntelija(JButton uusiPeli, JButton takaisinMenuun, JButton suljeOhjelma, Ui ui) {
        this.uusiPeli = uusiPeli;
        this.takaisinMenuun = takaisinMenuun;
        this.suljeOhjelma = suljeOhjelma;
        this.ui = ui;
        this.moottori = new Pelimoottori(ui, ui.getLogiikka());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == uusiPeli) {
            ui.getVanhaframe().setVisible(false);
            ui.getFrame().setVisible(false);
            Ui uusi = new Ui(new Sovelluslogiikka());
            uusi.kaynnistaEnsimmainenTaso();
        } else if (ae.getSource() == takaisinMenuun) {
            ui.getVanhaframe().setVisible(false);
            ui.getFrame().setVisible(false);
            Ui uusi = new Ui(new Sovelluslogiikka());
            uusi.luoMenu();
        } else if (ae.getSource() == suljeOhjelma) {
            System.exit(0);
        }
    }
}