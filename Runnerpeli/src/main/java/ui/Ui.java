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

    public Ui(Sovelluslogiikka logiikka) {
        this.logiikka = logiikka;
        this.moottori = new Pelimoottori(this, logiikka);
    }

    /**
     * Ohjelman näkymä luodaan tässä metodissa.
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
        JButton suljeOhjelma = new JButton("Sulje ohjelma");
        MenuHiirenKuuntelija menukuuntelija = new MenuHiirenKuuntelija(tasovalikko, suljeOhjelma, this);
        tasovalikko.addActionListener(menukuuntelija);
        suljeOhjelma.addActionListener(menukuuntelija);
        tasovalikko.setAlignmentX(Component.CENTER_ALIGNMENT);
        suljeOhjelma.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(tasovalikko);
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
        
        container.add(menuPanel, BorderLayout.CENTER);
    }
    
    /**
     * Pelin ensimmäinen taso käynnistetään täällä
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
     * Luodaan ikkuna, ja annetaan se pelille
     *
     * @param container
     */
    public void luoEnsimmaisenTasonKomponentit(Container container) {
        this.ikkuna = new Ikkuna(logiikka);
        container.add(ikkuna);
    }
    
    /**
     * Luodaan pelinjälkeinen menu
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
     * Pelinjälkeisen menun komponentit
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
     * Pelimoottoria varten luotu metodi, jossa päivitetään näkymää
     */
    public void piirra() {
        if (ikkuna == null) {
            return;
        }
        ikkuna.repaint();
        if (logiikka.getPeliloppui()) {
            moottori.sammuta();
            pelinjalkeinenMenu();
            return;
        }
    }

    public JFrame getFrame() {
        return frame;
    }
    
    public Sovelluslogiikka getLogiikka() {
        return logiikka;
    }
    
    public Pelimoottori getMoottori() {
        return moottori;
    }
}
