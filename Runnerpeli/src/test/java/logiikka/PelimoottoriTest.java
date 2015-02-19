/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ui.Ui;

/**
 *
 * @author Redande
 */
public class PelimoottoriTest {
    
    private Pelimoottori moottori;
    private Ui ui;
    private Sovelluslogiikka logiikka;
    
    public PelimoottoriTest() {
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
    public void toimiikoGetjaSetViesti() {
        moottori.setViesti("testi");
        assertEquals("testi", moottori.getViesti());
    }
}
