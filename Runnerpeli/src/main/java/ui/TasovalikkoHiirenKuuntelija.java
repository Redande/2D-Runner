package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Luokka tasovalikon nappien toiminnallisuutta varten.
 *
 * @author Redande
 */
class TasovalikkoHiirenKuuntelija implements ActionListener {

    private JButton ensimmainenTaso;
    private JButton toinenTaso;
    private JButton kolmasTaso;
    private Ui ui;

    /**
     * Konstruktorissa alustetaan luokan attribuutit.
     *
     * @param ensimmainenTaso
     * @param toinenTaso
     * @param kolmasTaso
     * @param ui
     */
    public TasovalikkoHiirenKuuntelija(JButton ensimmainenTaso, JButton toinenTaso, JButton kolmasTaso, Ui ui) {
        this.ensimmainenTaso = ensimmainenTaso;
        this.toinenTaso = toinenTaso;
        this.kolmasTaso = kolmasTaso;
        this.ui = ui;
    }

    /**
     * Metodissa toteutetaan nappien toiminnallisuudet.
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == ensimmainenTaso) {
            ui.getFrame().setVisible(false);
            ui.kaynnistaEnsimmainenTaso();
        } else if (ae.getSource() == toinenTaso) {
        } else if (ae.getSource() == kolmasTaso) {
        }
    }
}
