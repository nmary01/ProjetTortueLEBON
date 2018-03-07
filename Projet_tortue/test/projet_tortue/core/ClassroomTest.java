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
public class ClassroomTest {
    
    public ClassroomTest() {
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
     * Test of addPupil method, of class Classroom.
     */
    @org.junit.Test
    public void testAddPupil() {
        System.out.println("addEleve");
        Pupil e = new Pupil("Nathan","Mary");
        Classroom instance = new Classroom();
        assertEquals(instance.listPupils.size(),0);
        instance.addPupil(e);
        assertEquals(instance.listPupils.size(),1);
    }

    /**
     * Test of removePupil method, of class Classroom.
     */
    @org.junit.Test
    public void testRemovePupil() {
        System.out.println("removeEleve");
        String prenom = "Nathan";
        String nom = "Mary";
        Pupil e = new Pupil(prenom,nom);
        Classroom instance = new Classroom();
        instance.addPupil(e);
        assertEquals(instance.listPupils.size(),1);
        instance.removePupil(prenom, nom);
        assertEquals(instance.listPupils.size(),0);
    }

    
}
