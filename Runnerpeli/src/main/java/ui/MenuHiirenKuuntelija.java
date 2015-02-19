package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class MenuHiirenKuuntelija implements ActionListener {

    private JButton tasovalikko;

    private JButton suljeOhjelma;

    private Ui ui;

    public MenuHiirenKuuntelija(JButton tasovalikko, JButton suljeOhjelma, Ui ui) {
        this.tasovalikko = tasovalikko;
        this.suljeOhjelma = suljeOhjelma;
        this.ui = ui;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == tasovalikko) {
            ui.getFrame().setVisible(false);
            ui.luoTasovalikko();
        } else if (ae.getSource() == suljeOhjelma) {
            System.exit(0);
        }
    }
}
