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
 * Metodissa tarkastetaan törmääkö hahmo esteeseen. Jos ei, hahmo liikkuu eteenpäin
 */
    public void kaynnissa() {
            tormaako();
            if (!hahmo.getOnkoElossa()) {
                hahmo.setNopeus(0);
            }
            hahmo.juoksee(painovoima);
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
        int hahmonX = hahmo.getSijainti()[0];
        int hahmonY = hahmo.getSijainti()[1];
        int hahmonLeveys = hahmo.getKoko()[0];
        int hahmonKorkeus = hahmo.getKoko()[1];
        for (Este este : taso.getTasonEsteet()) {
            int esteenX = este.getSijainti()[0];
            int esteenY = este.getSijainti()[1];
            int esteenLeveys = este.getKoko()[0];
            int esteenKorkeus = este.getKoko()[1];
            
            if (hahmonX + (hahmonLeveys/2) < esteenX - (esteenLeveys/2)) {
            } else if (hahmonX - (hahmonLeveys/2) > esteenX + (esteenLeveys/2)) {               
            } else if (hahmonY + (hahmonKorkeus/2) < esteenY - (esteenKorkeus/2)) { 
            } else {
                hahmo.setOnkoElossa(false);
            }
            
           
        }
    }

}
