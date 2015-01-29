
package logiikka;

public class Hahmo {

    private int nopeus;
    private int x;
    private int y;

    public Hahmo() {
        this.nopeus = 10;
        this.x = 0;
        this.y = 0;
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

}
