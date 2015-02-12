
package ui;

import logiikka.Hahmo;
import java.awt.event.KeyEvent;
/**
 * Hahmon käyttöliittymäpuolta hoitava luokka
 * @author Redande
 */
public class HahmonAnimaatio {
    private Hahmo hahmo;
    private int x;
    private int y;
    private int leveys;
    private int korkeus;
    private boolean isVisible;
    
    public HahmonAnimaatio(Hahmo hahmo) {
        this.hahmo = hahmo;
        this.x = hahmo.getSijainti()[0];
        this.y = hahmo.getSijainti()[1];
        this.leveys = hahmo.getKoko()[0];
        this.korkeus = hahmo.getKoko()[1];
        this.isVisible = hahmo.getOnkoElossa();
    }
    
    public int[] getSijainti() {
        return new int[]{x, y};
    }
    
    public int[] getKoko() {
        return new int[]{leveys, korkeus};
    }
    
    public boolean getIsVisible() {
        return isVisible;
    }
    /**
     * Ikkunaa varten, jotta ikkuna piirtäisi hahmon aina oikeaan kohtaan ruudulla
     */
    public void paivitaSijainti() {
        this.x = hahmo.getSijainti()[0];
        this.y = hahmo.getSijainti()[1];
        this.isVisible = hahmo.getOnkoElossa();
    }
}
