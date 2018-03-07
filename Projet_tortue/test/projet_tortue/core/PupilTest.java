/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_tortue.core;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nathan
 */
public class PupilTest {
    
    public PupilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListTentatives method, of class Pupil.
     */
    @org.junit.Test
    public void testGetListTry() {
        System.out.println("getListTentatives");
        Pupil instance = new Pupil("Nathan","Mary");
        ArrayList<Try> expResult = null;
        ArrayList<Try> result = instance.getListTry();
        assertEquals(expResult, result);
    }

    /**
     * Test of addTry method, of class Pupil.
     */
    @org.junit.Test
    public void testAddTry() {
        System.out.println("addTentative");
        Exercice ex = new Exercice(new Reference("script"), null);
        String code = "blablabla";
        Try t = new Try(ex, code,"2018-03-07");
        Pupil instance = new Pupil("Nathan", "Mary");
        instance.addTry(t);
        assertEquals(instance.listTry.size(),1);
    }
    
}
