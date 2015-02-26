package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Luokka ohjevalikon takaisinMenuun-nappia varten.
 *
 * @author Redande
 */
public class OhjevalikkoHiirenKuuntelija implements ActionListener {

    private JButton takaisinMenuun;

    private Ui ui;

    /**
     * Konstruktorissa alustetaan luokan attribuutit.
     *
     * @param takaisinMenuun
     * @param ui
     */
    public OhjevalikkoHiirenKuuntelija(JButton takaisinMenuun, Ui ui) {
        this.takaisinMenuun = takaisinMenuun;
        this.ui = ui;
    }

    /**
     * Metodissa toteutetaan takaisinMenuun-napin painamisesta seuraavat
     * tapahtumat.
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == takaisinMenuun) {
            ui.getFrame().setVisible(false);
            ui.luoMenu();
        }
    }
}
