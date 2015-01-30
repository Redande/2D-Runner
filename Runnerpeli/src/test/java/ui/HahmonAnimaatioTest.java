
package ui;

import logiikka.Hahmo;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HahmonAnimaatioTest {
    
    HahmonAnimaatio hahmonAnimaatio;
    Hahmo hahmo;
    
    public HahmonAnimaatioTest() {
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
        this.hahmonAnimaatio = new HahmonAnimaatio(hahmo);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoKonstruktori() {
        Assert.assertArrayEquals(hahmo.getSijainti(), hahmonAnimaatio.getSijainti());
    }

}
