
package ui;

import javax.swing.JFrame;
import logiikka.Sovelluslogiikka;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UiTest {
    
    Ui ui;
    Sovelluslogiikka logiikka;
    
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
    }
    
    @After
    public void tearDown() {
    }
    
}
