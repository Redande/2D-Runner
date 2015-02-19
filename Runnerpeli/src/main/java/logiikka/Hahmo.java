package logiikka;
/**
 * Luokassa toteutetaan hahmon logiikkapuoli.
 * 
 * @author Redande
 */
public class Hahmo {

    private int x;
    private int y;
    private boolean onkoElossa;
    private int liikeY;
    private int leveys;
    private int korkeus;

    public Hahmo() {
        this.x = 100;
        this.y = 475;
        this.onkoElossa = true;
        this.liikeY = 0;
        this.leveys = 25;
        this.korkeus = 25;
    }
    
    public void setliikeY(int liikey) {
        this.liikeY = liikey;
    }
    
    public int getliikeY() {
        return liikeY;
    }

    public void setSijainti(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getSijainti() {
        return new int[]{x, y};
    }

    public void setOnkoElossa(boolean onkoElossa) {
        this.onkoElossa = onkoElossa;
    }

    public boolean getOnkoElossa() {
        return onkoElossa;
    }
    
    public void setKoko(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
    }
    
    public int[] getKoko() {
        return new int[]{leveys, korkeus};
    }
/**
 * Metodissa hoidetaan painovoiman vaikutus hahmoon, ja hyppäämisen alastulo
 * @param painovoima 
 */
    public void liikkuuko(int painovoima) { 
        y -= liikeY;
        
        liikeY -= painovoima;
        if (liikeY < -8) {
            liikeY = -8;
        }
        
        if (y >= 475) {
            y = 475;
        }
    }
/**
 * Metodissa toteutetaan hahmon hyppääminen
 */
    public void hyppaa() {
        if (liikeY == -8 && y == 475) {
            liikeY = 16;
        }
    }

}
