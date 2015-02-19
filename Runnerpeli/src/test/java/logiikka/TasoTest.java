
package logiikka;

import logiikka.Taso;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TasoTest {
    Taso taso;
    
    public TasoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        taso = new Taso();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoKonsruktoriJaGetteriEsteille() {
        Assert.assertNotNull(taso.getTasonEsteet());
    }
    
    @Test
    public void toimiikoGetjaLisaaMaali() {
        taso.lisaaMaali(new Maali(10, 10, 10, 10, 5));
        Assert.assertArrayEquals(new int[]{10, 10}, taso.getMaali().getSijainti());
        Assert.assertArrayEquals(new int[]{10, 10}, taso.getMaali().getKoko());
        assertEquals(5, taso.getMaali().getNopeus());
    }
}
