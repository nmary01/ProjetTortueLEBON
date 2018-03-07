package projet_tortue.core;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package projet_tortue.core;

import java.util.ArrayList;
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
public class ExerciceTest {
    private Exercice instance;
    public ExerciceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Exercice instance = new Exercice (new Reference ("script"), null);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addTry method, of class Exercice.
     */
    @org.junit.Test
    public void testAddTry() {
        System.out.println("addTry");
        Try newTry = new Try (instance ,"script 1","2018-03-07");
        assertEquals(instance.getListTry().size(),0);
        instance.addTry(newTry);
       assertEquals(instance.getListTry().size(),1);
    }

    /**
     * Test of getListTry method, of class Exercice.
     */
    @org.junit.Test
    public void testGetListTry() {
        System.out.println("getListTry");
        ArrayList<Try> expResult = new ArrayList<Try>();
        Try try1= new Try (instance ,"script 1","2018-03-07");
        Try try2= new Try (instance ,"script 2","2018-03-07");
        instance.addTry(try1);
        instance.addTry(try2);
        expResult.add(try1);
        expResult.add(try2);
        
        assertEquals(expResult, instance.getListTry());
       
    }

    /**
     * Test of getReference method, of class Exercice.
     */
    @org.junit.Test
    public void testGetReference() {
        System.out.println("getReference");
        Reference ref=new Reference("scritp");
         instance.changeReference(ref);
        Reference expResult = ref;
        Reference result = instance.getReference();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of changeReference method, of class Exercice.
     */
    @org.junit.Test
    public void testChangeReference() {
        System.out.println("changeReference");
        Reference theReference = new Reference ("script");
        Exercice instance = new Exercice (new Reference("coucou"), null);
        instance.changeReference(theReference);
        assertEquals(instance.getReference(), theReference);
    }
    
}
