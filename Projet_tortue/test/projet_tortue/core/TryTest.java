
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
public class TryTest {
   private Try instance; 
    public TryTest() {
    
}
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    Try instance= new Try (new Exercice(new Reference ("coucou"), null),"scriptEleve","2018-03-07");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGraduation method, of class Try.
     */
    @org.junit.Test
    public void testGetGraduation() {
        System.out.println("getGraduation");
        instance.setGraduation("c'est null");
        String expResult = "c'est null";
        String result = instance.getGraduation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGraduation method, of class Try.
     */
    @org.junit.Test
    public void testSetGraduation() {
        System.out.println("setGraduation");
        String graduation = "c'est null";
        instance.setGraduation(graduation);
        assertEquals(instance.getGraduation(),graduation);
    }

    /**
     * Test of getAppreciation method, of class Try.
     */
    @org.junit.Test
    public void testGetAppreciation() {
        System.out.println("getAppreciation");
        instance.setAppreciation("coucou");
        String expResult = "coucou";
        String result = instance.getAppreciation();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAppreciation method, of class Try.
     */
    @org.junit.Test
    public void testSetAppreciation() {
        System.out.println("setAppreciation");
        String appreciation = "coucou";
        instance.setAppreciation(appreciation);
        assertEquals(instance.getAppreciation(),appreciation);
    }
    
}
