package projet_tortue.core;

import java.util.ArrayList;

/**
 * This class allows to create a Teacher, who has a list of references and a list of classrooms.
 * @author Nathan
 * @version 04/03/18
 */
public class Teacher extends User {
    
    //The list of the different references made by the teacher
    ArrayList<Reference> listReferences;
    
    //The list of the differents classrooms of the teacher
    ArrayList<Classroom> listClassrooms;

    /**
     * create a new teacher and create empty lists of references and classrooms. 
     * Add a teacher to the database
     * @param prenom The first name of the teacher
     * @param nom The last name of the teacher
     */
    public Teacher(String prenom, String nom) {
        super(prenom, nom);
        listReferences=new ArrayList<Reference>();
        listClassrooms=new ArrayList<Classroom>();  
    }
    
    /**
     * add a reference to the list of reference
     * Update the database
     * @param newRef The new reference to add
     */
    public void addReference(Reference newRef){
        if (newRef.getScript()!=null){
            listReferences.add(newRef);
        }
        else System.out.println("Error: the reference has no script");
    }
    
    /**
     * remove a reference to the list of reference
     * Update the database
     * @param theRef the reference to remove
     * @return boolean true if reference found and removed
     */
    public boolean removeReference(Reference theRef){
        for (Reference r : listReferences){
            if (r.equals(theRef)){
                listReferences.remove(theRef);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Return the list of reference made by a teacher
     * @return listReferences
     */
    public ArrayList<Reference> getListReference(){
        return listReferences;
    }
    
    
    /**
     * Add a appreciation and a comment to a try
     * Update the try entity in the database
     * @param graduation the grade given by the teacher
     * @param appreciation the comment of the teacher (mandatory)
     * @param theTry the try corrected by the teacher
     */
    public void correctTry(String graduation, String appreciation, Try theTry){
        if (appreciation==null){
            System.out.println("Error: You have to write an appreciation");
        }
        else{
            theTry.setAppreciation(appreciation);
            theTry.setGraduation(graduation);
        }
    }
    
    /**
     * Add a Classroom to a teacher class list. 
     * Modify the classroom table in the database
     * @param theClassroom the classroom to add
     */
    public void addClassroom (Classroom theClassroom){
        listClassrooms.add(theClassroom);
    }
    
    /**
     * Remove a Classroom to a teacher class list.
     * Modify the classroom table in the database
     * @param theClassroom the classroom to remove
     * @return boolean true if classroom found and removed
     */
    public boolean removeClassroom (Classroom theClassroom){
        for (Classroom c : listClassrooms){
            if (c.equals(theClassroom)){
                listClassrooms.remove(c);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Return the list of classroom of a teacher
     * @return listClassrooms
     */
    public ArrayList<Classroom> getListClassroom (){
        return listClassrooms;
    }
    
}
