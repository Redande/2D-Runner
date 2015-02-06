
package logiikka;
/**
 * Luokassa toteutetaan esteiden rakenne, ja tarjotaan käyttöliittymälle ja sovelluslogiikalle hyödyllisiä settereitä ja gettereitä
 * @author Redande
 */
public class Este {

    private int x;
    private int y;
    private int leveys;
    private int korkeus;
/**
 * Alustetaan esteiden koko ja sijainti
 * @param x
 * @param y
 * @param leveys
 * @param korkeus 
 */
    public Este(int x, int y, int leveys, int korkeus) {
        this.x = x;
        this.y = y;
        this.leveys = leveys;
        this.korkeus = korkeus;
    }

    public void setSijainti(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getSijainti() {
        return new int[]{x, y};
    }
    
    public void setKoko(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
    }
    
    public int[] getKoko() {
        return new int[]{leveys, korkeus};
    }
}
