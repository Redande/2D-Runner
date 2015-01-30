
package ui;

import logiikka.Hahmo;
import java.awt.event.KeyEvent;

public class HahmonAnimaatio {
    private Hahmo hahmo;
    private int x;
    private int y;
    private boolean isVisible;
    
    public HahmonAnimaatio(Hahmo hahmo) {
        this.hahmo = hahmo;
        this.x = hahmo.getSijainti()[0];
        this.y = hahmo.getSijainti()[1];
        this.isVisible = hahmo.getOnkoElossa();
    }

    public void hyppaa(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            hahmo.hyppaa();
        }
    }
    
    public int[] getSijainti() {
        return new int[]{x, y};
    }
}
