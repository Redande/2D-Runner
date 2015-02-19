
package ui;

import java.awt.Graphics;
import logiikka.Sovelluslogiikka;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class IkkunaTest {
    
    private Sovelluslogiikka logiikka;
    private Ikkuna ikkuna;
    
    public IkkunaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.logiikka = new Sovelluslogiikka();
        this.ikkuna = new Ikkuna(logiikka);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoKonstruktori() {
        Assert.assertNotNull(this.logiikka);
        Assert.assertNotNull(this.ikkuna.getHahmo());
    }
    
}
