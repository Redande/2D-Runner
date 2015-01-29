
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
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoKonstruktori() {
        assertEquals(10, hahmo.getNopeus());
        Assert.assertArrayEquals(new int[]{0, 0}, hahmo.getSijainti());
    }
    
    @Test
    public void toimiikoSetNopeus() {
        hahmo.setNopeus(15);
        assertEquals(15, hahmo.getNopeus());
    }
    
    @Test
    public void toimiikoGetNopeus() {
        hahmo.setNopeus(2);
        assertEquals(2, hahmo.getNopeus());
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
    public void eiNegatiivistaNopeutta() {
        hahmo.setNopeus(-5);
        assertEquals(0, hahmo.getNopeus());
    }
}
