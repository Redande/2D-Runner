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
     * Ohjelman näkymä luodaan tässä metodissa
     */
    @Override
    public void run() {
        luoMenu();
    }

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
        
        JButton kaynnistaPeli = new JButton("Käynnistä peli");
        JButton suljeOhjelma = new JButton("Sulje ohjelma");
        MenuHiirenKuuntelija menuml = new MenuHiirenKuuntelija(kaynnistaPeli, suljeOhjelma, this);
        kaynnistaPeli.addActionListener(menuml);
        suljeOhjelma.addActionListener(menuml);
        kaynnistaPeli.setAlignmentX(Component.CENTER_ALIGNMENT);
        suljeOhjelma.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(kaynnistaPeli);
        menuPanel.add(suljeOhjelma);
        
        container.add(menuPanel, BorderLayout.CENTER);
    }               
    
    public void kaynnistaPeli() {
        moottori.start();
        
        frame = new JFrame("2D-Runner");
        frame.setPreferredSize(new Dimension(900, 600));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoPelinKomponentit(frame.getContentPane());

        NappaimistonKuuntelija kuuntelija = new NappaimistonKuuntelija(logiikka.getHahmo());
        frame.addKeyListener(kuuntelija);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Luodaan ikkuna, ja annetaan se ruudulle
     *
     * @param container
     */
    public void luoPelinKomponentit(Container container) {
        this.ikkuna = new Ikkuna(logiikka);
        container.add(ikkuna);
    }

    /**
     * Pelimoottoria varten luotu metodi, jossa päivitetään näkymää
     */
    public void piirra() {
        if (ikkuna == null) {
            return;
        }
        ikkuna.repaint();
    }

    public JFrame getFrame() {
        return frame;
    }
}
