
package logiikka;

public class Sovelluslogiikka {

    private Taso taso;
    private Hahmo hahmo;

    public Sovelluslogiikka() {
        this.taso = new Taso();
        this.hahmo = new Hahmo();
    }
    
    public Taso getTaso() {
        return taso;
    }
    
    public Hahmo getHahmo() {
        return hahmo;
    }
    
    public void kaynnista() {
        while (hahmo.getOnkoElossa()) {
//            peli pyörii
        }
    }
    
    public void tormaako() {
        for (Este este : taso.esteet) {
            if (este.getSijainti()[0] == hahmo.getSijainti()[0] && este.getSijainti()[1] == hahmo.getSijainti()[1]) {
                hahmo.setOnkoElossa(false);
            }
        }
    }

}
