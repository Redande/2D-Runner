package logiikka;
/**
 * Ohjelman logiikan keskus, jossa muut logiikkaluokat luodaan.
 * @author Redande
 */
public class Sovelluslogiikka {

    private Taso taso;
    private Hahmo hahmo;
    private int painovoima;
    private Maali maali;

    public Sovelluslogiikka() {
        this.taso = new Taso();
        this.hahmo = new Hahmo();
        lisaaEsteet();
        lisaaMaali();
        this.painovoima = 1;
        this.maali = taso.getMaali();
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
                return;
            }
            hahmo.liikkuuko(painovoima);
            for (Este este : taso.getTasonEsteet()) {
                este.liiku();
            }
            maali.liiku();
    }
/**
 * Metodissa luodaan esteet tasoon.
 */
    public void lisaaEsteet() {
        taso.lisaaEste(new Este(700, 475, 25, 25));
        taso.lisaaEste(new Este(900, 475, 25, 25));
        taso.lisaaEste(new Este(1100, 475, 25, 25));
        taso.lisaaEste(new Este(1300, 475, 25, 25));
        taso.lisaaEste(new Este(1500, 475, 25, 25));
        taso.lisaaEste(new Este(1700, 475, 25, 25));
        taso.lisaaEste(new Este(1900, 475, 25, 25));
        taso.lisaaEste(new Este(2100, 475, 25, 25));
        taso.lisaaEste(new Este(2300, 475, 25, 25));
        taso.lisaaEste(new Este(2500, 475, 25, 25));
    }
    /**
     * Lisätään maali.
     */
    public void lisaaMaali() {
        taso.lisaaMaali(new Maali(2700, 400, 10, 100));
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
        int maalinX = maali.getSijainti()[0];
        int maalinY = maali.getSijainti()[1];
        int maalinLeveys = maali.getKoko()[0];
        int maalinKorkeus = maali.getKoko()[1];
        if (hahmonX + (hahmonLeveys/2) < maalinX - (maalinLeveys/2)) {
            } else if (hahmonX - (hahmonLeveys/2) > maalinX + (maalinLeveys/2)) {               
            } else if (hahmonY + (hahmonKorkeus/2) < maalinY - (maalinKorkeus/2)) { 
            } else {
                hahmo.setOnkoElossa(false);
        }
    }

}
