
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
    
    Sovelluslogiikka sovelluslogiikka;
    
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
        this.sovelluslogiikka = new Sovelluslogiikka();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoKonstruktoriJaGetterit() {
        Assert.assertNotNull(sovelluslogiikka.getHahmo());
        Assert.assertNotNull(sovelluslogiikka.getTaso());
    }
}
