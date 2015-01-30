
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
    }
    
    @Test
    public void toimiikoKaynnista() {
//        testaa metodia kaynnista sitten kun se on toteutettu
    }
    
    @Test
    public void toimiikoTormaako() {
        logiikka.getTaso().lisaaEste(new Este(10, 50));
        logiikka.tormaako();
        assertEquals(false, logiikka.getHahmo().getOnkoElossa());
    }
}
