
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
        assertEquals(1, hahmo.getNopeus());
        Assert.assertArrayEquals(new int[]{10, 475}, hahmo.getSijainti());
        assertEquals(true, hahmo.getOnkoElossa());
        assertEquals(0, hahmo.getliikeY());
        Assert.assertArrayEquals(new int[]{25, 25}, hahmo.getKoko());
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
    
    @Test
    public void onkoElossaToimii() {
        assertEquals(true, hahmo.getOnkoElossa());
        hahmo.setOnkoElossa(false);
        assertEquals(false, hahmo.getOnkoElossa());
    }
    
    @Test
    public void toimiikoJuokseminen() {
        hahmo.juoksee(logiikka.getPainovoima());
        assertEquals(11, hahmo.getSijainti()[0]);
    }
    
    @Test
    public void onkoSamallaKorkeudellaHyppaamisenJalkeen() {
//        HYPPÄÄMISMETODIA PITÄÄ MUOKATA, VANHA TOTEUTUS POISTETTU
//        hahmo.hyppaa();
//        assertEquals(50, hahmo.getSijainti()[1]);
    }
    
    @Test
    public void toimiikoSetjaGetKoko() {
        Assert.assertArrayEquals(new int[]{25, 25}, hahmo.getKoko());
        hahmo.setKoko(50, 50);
        Assert.assertArrayEquals(new int[]{50, 50}, hahmo.getKoko());
    }
}
