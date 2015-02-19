
package logiikka;

import logiikka.Hahmo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HahmoTest {
    
    Hahmo hahmo;
    Sovelluslogiikka logiikka;
    
    public HahmoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.hahmo = new Hahmo();
        this.logiikka = new Sovelluslogiikka();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoKonstruktori() {
        Assert.assertArrayEquals(new int[]{100, 475}, hahmo.getSijainti());
        assertEquals(true, hahmo.getOnkoElossa());
        assertEquals(0, hahmo.getliikeY());
        Assert.assertArrayEquals(new int[]{25, 25}, hahmo.getKoko());
    }
    
    @Test
    public void toimiikoSetSijainti() {
        hahmo.setSijainti(2, 4);
        Assert.assertArrayEquals(new int[]{2, 4}, hahmo.getSijainti());
    }
    
    @Test
    public void toimiikoGetSijainti() {
        hahmo.setSijainti(3, 1);
        Assert.assertArrayEquals(new int[]{3, 1}, hahmo.getSijainti());
    }
    
    @Test
    public void toimiikoSetjaGetOnkoElossa() {
        assertEquals(true, hahmo.getOnkoElossa());
        hahmo.setOnkoElossa(false);
        assertEquals(false, hahmo.getOnkoElossa());
    }
    
    @Test
    public void toimiikoJuokseminen() {
        hahmo.liikkuuko(logiikka.getPainovoima());
        Assert.assertArrayEquals(new int[]{100, 475}, hahmo.getSijainti());
    }
    
    @Test
    public void toimiikoSetjaGetKoko() {
        Assert.assertArrayEquals(new int[]{25, 25}, hahmo.getKoko());
        hahmo.setKoko(50, 50);
        Assert.assertArrayEquals(new int[]{50, 50}, hahmo.getKoko());
    }
    
    @Test
    public void toimiikoGetjaSetLiikeY() {
        assertEquals(0, hahmo.getliikeY());
        hahmo.setliikeY(5);
        assertEquals(5, hahmo.getliikeY());
    }
    
    @Test
    public void toimiikoLiikkuuko() {
        hahmo.liikkuuko(logiikka.getPainovoima());
        assertEquals(100, hahmo.getSijainti()[0]);
        assertEquals(475, hahmo.getSijainti()[1]);
    }
    
    @Test
    public void toimiikoHyppaa() {
        hahmo.setliikeY(-8);
        assertEquals(-8, hahmo.getliikeY());
        hahmo.hyppaa();
        assertEquals(16, hahmo.getliikeY());
    }
}
