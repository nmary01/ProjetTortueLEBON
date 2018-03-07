/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_tortue.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author skaering
 */
public class ReferenceTest {
    private Reference instance;
    public ReferenceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {   
        Reference instance= new Reference("scritp");

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addLine method, of class Reference.
     */
    @org.junit.Test
    public void testAddLine() {
        setUp();
        System.out.println("addLine");
        String line = "coucou";
        instance.addLine(line);
        assertEquals(instance.getScript(),"script\ncoucou");
       
    }

    /**
     * Test of removeLine method, of class Reference.
     */
    @org.junit.Test
    public void testRemoveLine() {
        System.out.println("removeLine");
        String line = "coucou";
        instance.addLine(line);
        instance.removeLine(line);
        assertEquals(instance.getScript(),"script");
        assertEquals(instance.getBuffer(),"coucou");
    }

    /**
     * Test of getScript method, of class Reference.
     */
    @org.junit.Test
    public void testGetScript() {
        System.out.println("getScript");
        String expResult = "script";
        String result = instance.getScript();
        assertEquals(expResult, result);
    }

    /**
     * Test of setScript method, of class Reference.
     */
    @org.junit.Test
    public void testSetScript() {
        System.out.println("setScript");
        String script = "script1";
        instance.setScript(script);
        assertEquals(instance.getScript(),script);
    }

    /**
     * Test of getBuffer method, of class Reference.
     */
    @org.junit.Test
    public void testGetBuffer() {
        System.out.println("getBuffer");
        instance.removeLine("script");
        String expResult = "script";
        String result = instance.getBuffer();
        assertEquals(expResult, result);
        
    }
////////////////////////////////////////////////////////////////////////////////////////
    /////méthodes pas encores crées donc pas encore de JUnits 
    /**
     * Test of destroyReference method, of class Reference.
     */
    @org.junit.Test
    public void testDestroyReference() {
        System.out.println("destroyReference");
        Reference instance = null;
        instance.destroyReference();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of accelerer method, of class Reference.
     */
    @org.junit.Test
    public void testAccelerer() {
        System.out.println("accelerer");
        Reference instance = null;
        instance.accelerer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avancer method, of class Reference.
     */
    @org.junit.Test
    public void testAvancer() {
        System.out.println("avancer");
        Reference instance = null;
        instance.avancer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addVitesse method, of class Reference.
     */
    @org.junit.Test
    public void testAddVitesse() {
        System.out.println("addVitesse");
        Reference instance = null;
        instance.addVitesse();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ralentir method, of class Reference.
     */
    @org.junit.Test
    public void testRalentir() {
        System.out.println("ralentir");
        Reference instance = null;
        instance.ralentir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Reference.
     */
    @org.junit.Test
    public void testSetColor() {
        System.out.println("setColor");
        Reference instance = null;
        instance.setColor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
