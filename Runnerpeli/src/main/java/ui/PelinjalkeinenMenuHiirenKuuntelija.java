package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class PelinjalkeinenMenuHiirenKuuntelija implements ActionListener {
    private JButton uusiPeli;
    private JButton takaisinMenuun;
    private JButton suljeOhjelma;
    private Ui ui;

    public PelinjalkeinenMenuHiirenKuuntelija(JButton uusiPeli, JButton takaisinMenuun, JButton suljeOhjelma, Ui ui) {
        this.uusiPeli = uusiPeli;
        this.takaisinMenuun = takaisinMenuun;
        this.suljeOhjelma = suljeOhjelma;
        this.ui = ui;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == uusiPeli) {
            ui.getFrame().setVisible(false);
            ui.kaynnistaEnsimmainenTaso();
        } else if (ae.getSource() == takaisinMenuun) {
            ui.getFrame().setVisible(false);
            ui.luoMenu();
        } else if (ae.getSource() == suljeOhjelma) {
            System.exit(0);
        }
    }
}