
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
    public void toimiikoKonsruktoriJaGetteri() {
        Assert.assertNotNull(taso.getTasonEsteet());
    }
}
