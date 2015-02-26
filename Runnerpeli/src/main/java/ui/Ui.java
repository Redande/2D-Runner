package ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import logiikka.Pelimoottori;
import logiikka.Sovelluslogiikka;

/**
 * Ohjelman graafisen puolen keskus
 *
 * @author Redande
 */
public class Ui implements Runnable {

    private JFrame frame;
    private Ikkuna ikkuna;
    private Sovelluslogiikka logiikka;
    private Pelimoottori moottori;
    private JFrame vanhaframe;

    /**
     * Konstruktorissa alustetaan luokan logiikka- ja moottori-attribuutit.
     *
     * @param logiikka
     */
    public Ui(Sovelluslogiikka logiikka) {
        this.logiikka = logiikka;
        this.moottori = new Pelimoottori(this, logiikka);
    }

    /**
     * Ohjelman käyttöliittymän käynnistysmetodi, jossa luodaan ensimmäinen
     * valikko.
     */
    @Override
    public void run() {
        luoMenu();
    }

    /**
     * Metodissa luodaan menu.
     */
    public void luoMenu() {
        frame = new JFrame("2D-Runner");
        frame.setPreferredSize(new Dimension(150, 300));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoMenunKomponentit(frame.getContentPane());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Luodaan menun komponentit.
     *
     * @param container
     */
    public void luoMenunKomponentit(Container container) {
        BorderLayout frameLayout = new BorderLayout();
        container.setLayout(frameLayout);

        JPanel menuPanel = new JPanel();
        BoxLayout menuPanelLayout = new BoxLayout(menuPanel, BoxLayout.Y_AXIS);
        menuPanel.setLayout(menuPanelLayout);
        menuPanel.add(Box.createRigidArea(new Dimension(25, 25)));

        JLabel menuLabel = new JLabel("Menu");
        menuLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(menuLabel);
        menuPanel.add(Box.createRigidArea(new Dimension(25, 25)));

        JButton tasovalikko = new JButton("Tasovalikko");
        JButton ohjeet = new JButton("Ohjeet");
        JButton suljeOhjelma = new JButton("Sulje ohjelma");
        MenuHiirenKuuntelija menukuuntelija = new MenuHiirenKuuntelija(tasovalikko, ohjeet, suljeOhjelma, this);
        tasovalikko.addActionListener(menukuuntelija);
        ohjeet.addActionListener(menukuuntelija);
        suljeOhjelma.addActionListener(menukuuntelija);
        tasovalikko.setAlignmentX(Component.CENTER_ALIGNMENT);
        ohjeet.setAlignmentX(Component.CENTER_ALIGNMENT);
        suljeOhjelma.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(tasovalikko);
        menuPanel.add(ohjeet);
        menuPanel.add(suljeOhjelma);

        container.add(menuPanel, BorderLayout.CENTER);
    }

    /**
     * Luodaan tasovalikko menua varten.
     */
    public void luoTasovalikko() {
        frame = new JFrame("2D-Runner");
        frame.setPreferredSize(new Dimension(150, 300));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoTasovalikonKomponentit(frame.getContentPane());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Luodaan tasovalikon komponentit.
     *
     * @param container
     */
    public void luoTasovalikonKomponentit(Container container) {
        BorderLayout frameLayout = new BorderLayout();
        container.setLayout(frameLayout);

        JPanel menuPanel = new JPanel();
        BoxLayout menuPanelLayout = new BoxLayout(menuPanel, BoxLayout.Y_AXIS);
        menuPanel.setLayout(menuPanelLayout);
        menuPanel.add(Box.createRigidArea(new Dimension(25, 25)));

        JLabel menuLabel = new JLabel("Tasovalikko");
        menuLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(menuLabel);
        menuPanel.add(Box.createRigidArea(new Dimension(25, 25)));

        JButton ensimmainenTaso = new JButton("Ensimmäinen taso");
        JButton toinenTaso = new JButton("Toinen taso");
        JButton kolmasTaso = new JButton("Kolmas taso");
        TasovalikkoHiirenKuuntelija tasovalikkokuuntelija = new TasovalikkoHiirenKuuntelija(ensimmainenTaso, toinenTaso, kolmasTaso, this);
        ensimmainenTaso.addActionListener(tasovalikkokuuntelija);
        toinenTaso.addActionListener(tasovalikkokuuntelija);
        kolmasTaso.addActionListener(tasovalikkokuuntelija);
        ensimmainenTaso.setAlignmentX(Component.CENTER_ALIGNMENT);
        toinenTaso.setAlignmentX(Component.CENTER_ALIGNMENT);
        kolmasTaso.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(ensimmainenTaso);
        menuPanel.add(toinenTaso);
        menuPanel.add(kolmasTaso);

        // Toinen ja kolmas nappi poistettu käytöstä kunnes tasot on toteutettu.
        toinenTaso.setEnabled(false);
        kolmasTaso.setEnabled(false);

        container.add(menuPanel, BorderLayout.CENTER);
    }

    /**
     * Luodaan ohjevalikko menua varten.
     */
    public void luoOhjevalikko() {
        frame = new JFrame("2D-Runner");
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoOhjevalikonKomponentit(frame.getContentPane());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Luodaan ohjevalikon komponentit.
     *
     * @param container
     */
    public void luoOhjevalikonKomponentit(Container container) {
        BorderLayout frameLayout = new BorderLayout();
        container.setLayout(frameLayout);

        JPanel menuPanel = new JPanel();
        BoxLayout menuPanelLayout = new BoxLayout(menuPanel, BoxLayout.Y_AXIS);
        menuPanel.setLayout(menuPanelLayout);
        menuPanel.add(Box.createRigidArea(new Dimension(25, 25)));

        JLabel menuLabel = new JLabel("Ohjeet");
        menuLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(menuLabel);
        menuPanel.add(Box.createRigidArea(new Dimension(25, 25)));

        JLabel ohjerivi1 = new JLabel("Hahmo hyppää painamalla välilyöntiä.");
        JLabel ohjerivi2 = new JLabel("Esteisiin (mustat neliöt) ei saa osua.");
        JLabel ohjerivi3 = new JLabel("Vihreä pystypalkki on maali.");

        ohjerivi1.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(ohjerivi1);
        ohjerivi2.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(ohjerivi2);
        ohjerivi3.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(ohjerivi3);

        JButton takaisinMenuun = new JButton("Takaisin menuun");
        OhjevalikkoHiirenKuuntelija ohjevalikkokuuntelija = new OhjevalikkoHiirenKuuntelija(takaisinMenuun, this);
        takaisinMenuun.addActionListener(ohjevalikkokuuntelija);
        takaisinMenuun.setAlignmentX(Component.CENTER_ALIGNMENT);

        menuPanel.add(takaisinMenuun);

        container.add(menuPanel, BorderLayout.CENTER);
    }

    /**
     * Pelin ensimmäinen taso käynnistetään täällä.
     */
    public void kaynnistaEnsimmainenTaso() {
        moottori.start();

        frame = new JFrame("2D-Runner");
        frame.setPreferredSize(new Dimension(900, 600));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoEnsimmaisenTasonKomponentit(frame.getContentPane());

        NappaimistonKuuntelija kuuntelija = new NappaimistonKuuntelija(logiikka.getHahmo());
        frame.addKeyListener(kuuntelija);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Luodaan ikkuna, ja annetaan se pelille.
     *
     * @param container
     */
    public void luoEnsimmaisenTasonKomponentit(Container container) {
        this.ikkuna = new Ikkuna(logiikka);
        container.add(ikkuna);
    }

    /**
     * Luodaan pelinjälkeinen menu.
     */
    public void pelinjalkeinenMenu() {
        frame = new JFrame("2D-Runner");
        frame.setPreferredSize(new Dimension(150, 300));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoPelinjalkeisenMenunKomponentit(frame.getContentPane());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Pelinjälkeisen menun komponentit.
     *
     * @param container
     */
    public void luoPelinjalkeisenMenunKomponentit(Container container) {
        BorderLayout frameLayout = new BorderLayout();
        container.setLayout(frameLayout);

        JPanel menuPanel = new JPanel();
        BoxLayout menuPanelLayout = new BoxLayout(menuPanel, BoxLayout.Y_AXIS);
        menuPanel.setLayout(menuPanelLayout);
        menuPanel.add(Box.createRigidArea(new Dimension(25, 25)));

        JLabel menuLabel = new JLabel(moottori.getViesti());
        menuLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(menuLabel);
        menuPanel.add(Box.createRigidArea(new Dimension(25, 25)));

        JButton uusiPeli = new JButton("Uusi peli");
        JButton takaisinMenuun = new JButton("Takaisin menuun");
        JButton suljeOhjelma = new JButton("Sulje ohjelma");
        PelinjalkeinenMenuHiirenKuuntelija pelinjalkmenukuuntelija = new PelinjalkeinenMenuHiirenKuuntelija(uusiPeli, takaisinMenuun, suljeOhjelma, this);
        uusiPeli.addActionListener(pelinjalkmenukuuntelija);
        takaisinMenuun.addActionListener(pelinjalkmenukuuntelija);
        suljeOhjelma.addActionListener(pelinjalkmenukuuntelija);
        uusiPeli.setAlignmentX(Component.CENTER_ALIGNMENT);
        takaisinMenuun.setAlignmentX(Component.CENTER_ALIGNMENT);
        suljeOhjelma.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(uusiPeli);
        menuPanel.add(takaisinMenuun);
        menuPanel.add(suljeOhjelma);

        container.add(menuPanel, BorderLayout.CENTER);
    }

    /**
     * Pelimoottoria varten luotu metodi, jossa päivitetään näkymää.
     */
    public void piirra() {
        if (ikkuna == null) {
            return;
        }
        ikkuna.repaint();
        if (logiikka.getPeliloppui()) {
            moottori.sammuta();
            vanhaframe = frame;
            pelinjalkeinenMenu();
            return;
        }
    }

    public JFrame getFrame() {
        return frame;
    }

    public JFrame getVanhaframe() {
        return vanhaframe;
    }

    public Sovelluslogiikka getLogiikka() {
        return logiikka;
    }

    public Pelimoottori getMoottori() {
        return moottori;
    }
}
