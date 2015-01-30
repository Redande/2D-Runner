
package ui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import logiikka.Sovelluslogiikka;

public class Ui extends JPanel implements Runnable {
    private JFrame frame;
    private HahmonAnimaatio hahmo;
    private Sovelluslogiikka logiikka;
    
    public Ui() {
        super.setBackground(Color.GRAY);
        this.logiikka = new Sovelluslogiikka();
        this.hahmo = new HahmonAnimaatio(logiikka.getHahmo());
    }
    
    @Override
    public void run() {
        frame = new JFrame("2D-Runner");
        frame.setPreferredSize(new Dimension(900, 600));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.pack();
        frame.setVisible(true);
        
        
        
        logiikka.kaynnista();
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
