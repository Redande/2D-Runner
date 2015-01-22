/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnerpeli.runnerpeli.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Redande
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({runnerpeli.runnerpeli.logiikka.HahmoTest.class, runnerpeli.runnerpeli.logiikka.EsteTest.class, runnerpeli.runnerpeli.logiikka.SovelluslogiikkaTest.class, runnerpeli.runnerpeli.logiikka.TasoTest.class})
public class LogiikkaSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
