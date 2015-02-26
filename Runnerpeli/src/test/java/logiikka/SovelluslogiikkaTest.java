
package logiikka;

import logiikka.Sovelluslogiikka;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SovelluslogiikkaTest {
    
    Sovelluslogiikka logiikka;
    
    public SovelluslogiikkaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.logiikka = new Sovelluslogiikka();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoKonstruktoriJaGetterit() {
        Assert.assertNotNull(logiikka.getHahmo());
        Assert.assertNotNull(logiikka.getTaso());
        assertEquals(1, logiikka.getPainovoima());
        assertEquals(false, logiikka.getPeliloppui());
    }
    
    @Test
    public void toimiikoGetjaSetPainovoima() {
        assertEquals(1, logiikka.getPainovoima());
        logiikka.setPainovoima(5);
        assertEquals(5, logiikka.getPainovoima());
    }
    
    @Test
    public void toimiikoKaynnissa() {
        assertEquals("", logiikka.kaynnissa());
        
        logiikka.getTaso().lisaaEste(new Este(100, 475, 25, 25, 5));
        logiikka.kaynnissa();
        assertEquals(false, logiikka.getHahmo().getOnkoElossa());
        assertEquals("GG GET REKT", logiikka.kaynnissa());
    }
    
    @Test
    public void toimiikoTormaakoHahmo() {
        logiikka.getTaso().lisaaEste(new Este(100, 475, 25, 25, 5));
        logiikka.tormaakoHahmo();
        assertEquals(false, logiikka.getHahmo().getOnkoElossa());
        assertEquals(true, logiikka.tormaakoHahmo());
    }
    
    @Test
    public void toimiikoTormaako() {
        Este uusi = new Este(100, 475, 25, 25, 5);
        logiikka.getTaso().lisaaEste(uusi);
        assertEquals(true, logiikka.tormaako(logiikka.getHahmo().getSijainti(), logiikka.getHahmo().getKoko(), uusi.getSijainti(), uusi.getKoko()));
    }
}
