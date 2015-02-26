package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Luokka menun nappien toiminnallisuutta varten.
 *
 * @author Redande
 */
class MenuHiirenKuuntelija implements ActionListener {

    private JButton tasovalikko;

    private JButton suljeOhjelma;

    private JButton ohjeet;

    private Ui ui;

    /**
     * Konstruktorissa alustetaan luokan attribuutit.
     *
     * @param tasovalikko
     * @param ohjeet
     * @param suljeOhjelma
     * @param ui
     */
    public MenuHiirenKuuntelija(JButton tasovalikko, JButton ohjeet, JButton suljeOhjelma, Ui ui) {
        this.tasovalikko = tasovalikko;
        this.ohjeet = ohjeet;
        this.suljeOhjelma = suljeOhjelma;
        this.ui = ui;
    }

    /**
     * Metodissa toteutetaan nappien painallusten tapahtumat.
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == tasovalikko) {
            ui.getFrame().setVisible(false);
            ui.luoTasovalikko();
        } else if (ae.getSource() == ohjeet) {
            ui.getFrame().setVisible(false);
            ui.luoOhjevalikko();
        } else if (ae.getSource() == suljeOhjelma) {
            System.exit(0);
        }
    }
}
