
package ui;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Ui implements Runnable {
    private JFrame frame;
    
    public Ui() {
        
    }
    
    @Override
    public void run() {
        frame = new JFrame("2D-Runner");
        frame.setPreferredSize(new Dimension(400, 300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
