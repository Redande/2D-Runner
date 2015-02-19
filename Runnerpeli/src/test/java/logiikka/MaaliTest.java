
package logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaaliTest {
    
    private Maali maali;
    
    public MaaliTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.maali = new Maali(1000, 400, 100, 10, 5);
    }
    
    @After
    public void tearDown() {
    }  
    
    @Test
    public void toimiikoKonstruktori() {
        assertEquals(1000, maali.getSijainti()[0]);
        assertEquals(400, maali.getSijainti()[1]);
        assertEquals(100, maali.getKoko()[0]);
        assertEquals(10, maali.getKoko()[1]);
        assertEquals(5, maali.getNopeus());
    }
    
    @Test
    public void toimiikoGetjaSetSijainti() {
        maali.setSijainti(10, 10);
        Assert.assertArrayEquals(new int[]{10, 10}, maali.getSijainti());
    }
    
    @Test
    public void toimiikoGetjaSetKoko() {
        maali.setKoko(5, 5);
        Assert.assertArrayEquals(new int[]{5, 5}, maali.getKoko());
    }
    
    @Test
    public void toimiikoOnkoRuudulla() {
        maali.setSijainti(100, 400);
        assertEquals(true, maali.onkoRuudulla());
    }
    
    @Test
    public void toimiikoLiiku() {
        maali.setSijainti(10, 400);
        maali.liiku();
        Assert.assertArrayEquals(new int[]{5, 400}, maali.getSijainti());
    }
    
    @Test
    public void toimiikoGetjaSetNopeus() {
        maali.setNopeus(2);
        assertEquals(2, maali.getNopeus());
    }
}
