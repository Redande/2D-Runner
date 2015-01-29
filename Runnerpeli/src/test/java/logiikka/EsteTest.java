
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
        este = new Este();
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
        Este toinenEste = new Este();
        Assert.assertArrayEquals(new int[]{0, 0}, toinenEste.getSijainti());
    }
    
    @Test
    public void toimiikoSetSijainti() {
        Este toinenEste = new Este();
        toinenEste.setSijainti(5, 3);
        Assert.assertArrayEquals(new int[]{5,3}, toinenEste.getSijainti());
    }
}
