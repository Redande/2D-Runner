
package logiikka;

import logiikka.Este;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EsteTest {
    
    Este este;
    
    public EsteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        este = new Este(10, 10, 10, 10, 5);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoGetSijainti() {
        este.setSijainti(2, 3);
        Assert.assertArrayEquals(new int[]{2,3}, este.getSijainti());
    }
    
    @Test
    public void toimiikoKonstruktori() {
        Este toinenEste = new Este(2, 6, 10, 10, 5);
        Assert.assertArrayEquals(new int[]{2, 6}, toinenEste.getSijainti());
        Assert.assertArrayEquals(new int[]{10, 10}, toinenEste.getKoko());
    }
    
    @Test
    public void toimiikoSetSijainti() {
        Este toinenEste = new Este(0, 0, 10, 10, 5);
        toinenEste.setSijainti(5, 3);
        Assert.assertArrayEquals(new int[]{5,3}, toinenEste.getSijainti());
    }
    
    @Test
    public void toimiikoGetjaSetKoko() {
        Assert.assertArrayEquals(new int[]{10, 10}, este.getKoko());
        este.setKoko(20, 20);
        Assert.assertArrayEquals(new int []{20, 20}, este.getKoko());
    }
    
    @Test
    public void toimiikoOnkoRuudulla() {
        assertEquals(true, este.onkoRuudulla());
        este.setSijainti(2000, 475);
        assertEquals(false, este.onkoRuudulla());
    }
    
    @Test
    public void toimiikoLiiku() {
        este.liiku();
        Assert.assertArrayEquals(new int[]{5, 10}, este.getSijainti());
    }
    
    @Test
    public void toimiikoGetjaSetNopeus() {
        este.setNopeus(10);
        assertEquals(10, este.getNopeus());
    }
}
