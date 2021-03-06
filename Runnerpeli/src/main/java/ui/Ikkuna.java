package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import logiikka.Este;
import logiikka.Maali;
import logiikka.Sovelluslogiikka;

/**
 * Luokka, jossa luodaan esteiden ja hahmon graafiset esitykset, ja muutenkin
 * graafista puolta esim. tausta.
 *
 * @author Redande
 */
public class Ikkuna extends JPanel {

    private Sovelluslogiikka logiikka;
    private HahmonAnimaatio hahmo;

    /**
     * Konstruktorissa alustetaan ikkunan attribuutit.
     *
     * @param logiikka
     */
    public Ikkuna(Sovelluslogiikka logiikka) {
        this.logiikka = logiikka;
        this.hahmo = new HahmonAnimaatio(logiikka.getHahmo());
    }

    /**
     * Metodissa piirretään hahmo, sekä piirretään ne esteet ja maali jotka ovat
     * näkyvissä ruudulla.
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        super.setBackground(Color.LIGHT_GRAY);

        g.setColor(Color.BLACK);

        g.drawLine(0, 500, 900, 500);

        List<Este> esteet = new ArrayList<Este>();
        esteet.addAll(logiikka.getTaso().getTasonEsteet());

        for (Este este : esteet) {
            if (este.onkoRuudulla()) {
                g.fillRect(este.getSijainti()[0], este.getSijainti()[1], este.getKoko()[0], este.getKoko()[1]);
            }
        }

        hahmo.paivitaSijainti();
        if (hahmo.getIsVisible()) {
            g.setColor(Color.red);
            g.fillOval(hahmo.getSijainti()[0], hahmo.getSijainti()[1], hahmo.getKoko()[0], hahmo.getKoko()[1]);
        }

        Maali maali = logiikka.getTaso().getMaali();
        if (maali.onkoRuudulla()) {
            g.setColor(Color.GREEN);
            g.fillRect(maali.getSijainti()[0], maali.getSijainti()[1], maali.getKoko()[0], maali.getKoko()[1]);
        }

        getToolkit().sync();
    }

    public HahmonAnimaatio getHahmo() {
        return hahmo;
    }
}
