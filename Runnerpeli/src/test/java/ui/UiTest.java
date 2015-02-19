
package ui;

import javax.swing.JFrame;
import logiikka.Pelimoottori;
import logiikka.Sovelluslogiikka;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UiTest {
    
    Ui ui;
    Sovelluslogiikka logiikka;
    Pelimoottori moottori;
    
    public UiTest() {
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
        this.ui = new Ui(logiikka);
        this.moottori = new Pelimoottori(ui, logiikka);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void toimiikoKonstruktori() {
        Assert.assertNotNull(this.logiikka);
        Assert.assertNotNull(this.moottori);
    }
    
    @Test
    public void toimiikoGetLogiikka() {
        Assert.assertNotNull(ui.getLogiikka());
    }
    
    @Test
    public void toimiikoGetMoottori() {
        Assert.assertNotNull(ui.getMoottori());
    }
}
