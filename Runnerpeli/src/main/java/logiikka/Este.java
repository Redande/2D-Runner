package logiikka;

/**
 * Luokassa toteutetaan esteiden rakenne, liikkuminen, ja tarjotaan
 * käyttöliittymälle ja sovelluslogiikalle hyödyllisiä settereitä ja gettereitä.
 *
 * @author Redande
 */
public class Este {

    private int x;
    private int y;
    private int leveys;
    private int korkeus;
    private int nopeus;

    /**
     * Alustetaan esteiden koko ja sijainti.
     *
     * @param x
     * @param y
     * @param leveys
     * @param korkeus
     * @param nopeus
     */
    public Este(int x, int y, int leveys, int korkeus, int nopeus) {
        this.x = x;
        this.y = y;
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.nopeus = nopeus;
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

    /**
     * Tarkastetaan onko este näkyvissä ruudulla Ikkunan piirtämistä varten.
     *
     * @return
     */
    public boolean onkoRuudulla() {
        return x < 900 + leveys && x > 0 - leveys;
    }

    /**
     * Liikutetaan estettä hahmoa päin.
     */
    public void liiku() {
        x -= nopeus;
    }

    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }

    public int getNopeus() {
        return nopeus;
    }
}
