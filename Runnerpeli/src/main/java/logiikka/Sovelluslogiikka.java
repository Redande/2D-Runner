
package logiikka;

public class Sovelluslogiikka {

    Taso taso;
    Hahmo hahmo;

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

}
