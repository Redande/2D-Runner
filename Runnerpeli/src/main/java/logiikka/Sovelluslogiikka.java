package logiikka;

/**
 * Ohjelman logiikan keskus, jossa muut logiikkaluokat luodaan.
 *
 * @author Redande
 */
public class Sovelluslogiikka {

    private Taso taso;
    private Hahmo hahmo;
    private int painovoima;
    private Maali maali;
    private boolean peliloppui;

    /**
     * Konstruktorissa alustetaan logiikan attribuutit, sekä lisätään esteet ja
     * maali.
     */
    public Sovelluslogiikka() {
        this.taso = new Taso();
        this.hahmo = new Hahmo();
        lisaaEsteet();
        lisaaMaali();
        this.painovoima = 1;
        this.maali = taso.getMaali();
        this.peliloppui = false;
    }

    public Taso getTaso() {
        return taso;
    }

    public Hahmo getHahmo() {
        return hahmo;
    }

    public void setPainovoima(int painovoima) {
        this.painovoima = painovoima;
    }

    public int getPainovoima() {
        return painovoima;
    }

    /**
     * Metodissa tarkastetaan törmääkö hahmo esteeseen. Jos ei, hahmo liikkuu
     * eteenpäin. Jos törmää, palautetaan tilanteeseen sopiva loppuviesti.
     *
     * @return
     */
    public String kaynnissa() {
        boolean tormasiko = tormaakoHahmo();
        if (tormasiko && hahmo.getOnkoElossa()) {
            return "GG WP";
        } else if (tormasiko) {
            return "GG GET REKT";
        }
        hahmo.liikkuuko(painovoima);
        for (Este este : taso.getTasonEsteet()) {
            este.liiku();
        }
        maali.liiku();
        return "";
    }

    /**
     * Metodissa luodaan esteet tasoon.
     */
    public void lisaaEsteet() {
        taso.lisaaEste(new Este(700, 475, 25, 25, 5));
        taso.lisaaEste(new Este(900, 475, 25, 25, 5));
        taso.lisaaEste(new Este(1100, 475, 25, 25, 5));
        taso.lisaaEste(new Este(1300, 475, 25, 25, 5));
        taso.lisaaEste(new Este(1500, 475, 25, 25, 5));
        taso.lisaaEste(new Este(1700, 475, 25, 25, 5));
        taso.lisaaEste(new Este(1900, 475, 25, 25, 5));
        taso.lisaaEste(new Este(2100, 475, 25, 25, 5));
        taso.lisaaEste(new Este(2300, 475, 25, 25, 5));
        taso.lisaaEste(new Este(2500, 475, 25, 25, 5));
    }

    /**
     * Lisätään maali.
     */
    public void lisaaMaali() {
        taso.lisaaMaali(new Maali(2700, 400, 10, 100, 5));
    }

    /**
     * Tarkistetaan, törmääkö hahmo esteeseen tai maaliin tormaako-metodin
     * avulla.
     *
     * @return
     */
    public boolean tormaakoHahmo() {
        for (Este este : taso.getTasonEsteet()) {
            if (tormaako(hahmo.getSijainti(), hahmo.getKoko(), este.getSijainti(), este.getKoko())) {
                hahmo.setOnkoElossa(false);
                peliloppui = true;
            }
        }

        if (tormaako(hahmo.getSijainti(), hahmo.getKoko(), maali.getSijainti(), maali.getKoko())) {
            peliloppui = true;
        }

        return peliloppui;
    }

    /**
     * Tarkistetaan, törmääkö kaksi kappaletta toisiinsa, eli onko niiden reunat
     * toisensa sisällä.
     *
     * @param ensimmaisenSijainti
     * @param ensimmaisenKoko
     * @param toisenSijainti
     * @param toisenKoko
     * @return
     */
    public boolean tormaako(int[] ensimmaisenSijainti, int[] ensimmaisenKoko, int[] toisenSijainti, int[] toisenKoko) {
        boolean palautus = false;

        if (ensimmaisenSijainti[0] + (ensimmaisenKoko[0] / 2) < toisenSijainti[0] - (toisenKoko[0] / 2)) {
        } else if (ensimmaisenSijainti[0] - (ensimmaisenKoko[0] / 2) > toisenSijainti[0] + (toisenKoko[0] / 2)) {
        } else if (ensimmaisenSijainti[1] + (ensimmaisenKoko[1] / 2) < toisenSijainti[1] - (toisenKoko[1] / 2)) {
        } else {
            palautus = true;
        }

        return palautus;
    }

    public boolean getPeliloppui() {
        return peliloppui;
    }

}
