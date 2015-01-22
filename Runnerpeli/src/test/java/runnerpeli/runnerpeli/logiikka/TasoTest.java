/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnerpeli.runnerpeli.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Redande
 */
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
