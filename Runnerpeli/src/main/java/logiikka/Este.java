
package logiikka;

public class Este {

    private int x;
    private int y;

    public Este(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSijainti(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getSijainti() {
        return new int[]{x, y};
    }
}
