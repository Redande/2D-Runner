
package logiikka;

public class Hahmo {

    private int nopeus;
    private int x;
    private int y;
    private boolean onkoElossa;

    public Hahmo() {
        this.nopeus = 10;
        this.x = 10;
        this.y = 50;
        this.onkoElossa = true;
    }

    public void setNopeus(int nopeus) {
        if (nopeus < 0) {
            this.nopeus = 0;
        } else {
            this.nopeus = nopeus;
        }
    }

    public int getNopeus() {
        return nopeus;
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
    
    public void juoksee() {
        x += nopeus;
    }
    
    public void hyppaa() {
        for (int i = 0; i < 50; i++) {
            y++;
        }
        for (int i = 50; i > 0; i--) {
            y--;
        }
    }

}
