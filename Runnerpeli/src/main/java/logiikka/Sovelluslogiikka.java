package logiikka;
/**
 * Ohjelman logiikan keskus, jossa muut logiikkaluokat luodaan.
 * @author Redande
 */
public class Sovelluslogiikka {

    private Taso taso;
    private Hahmo hahmo;
    private int painovoima;

    public Sovelluslogiikka() {
        this.taso = new Taso();
        this.hahmo = new Hahmo();
        lisaaEsteet();
        this.painovoima = 1;
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
 * Metodissa pyöritetään logiikkaa niin kauan, kun hahmo on hengissä
 */
    public void kaynnissa() {
//        hahmo.juoksee(painovoima);

    }
/**
 * Metodissa luodaan esteet tasoon.
 */
    public void lisaaEsteet() {
        taso.lisaaEste(new Este(700, 475, 25, 25));
    }
/**
 * Tarkistetaan, törmääkö hahmo esteeseen
 */
    public void tormaako() {
        for (Este este : taso.getTasonEsteet()) {
            if (este.getSijainti()[0] == hahmo.getSijainti()[0] && este.getSijainti()[1] == hahmo.getSijainti()[1]) {
                hahmo.setOnkoElossa(false);
            }
        }
    }

}
