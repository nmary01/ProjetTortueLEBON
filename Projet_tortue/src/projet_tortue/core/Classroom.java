package projet_tortue.core;

import java.util.ArrayList;

/**
 * This class Classroom allows to create a classroom with a list of pupils.
 * They can be added and removed
 * @author Nathan
 * @version 4/03/18
 */
public class Classroom {
    
    //The list of pupils in the classroom 
    ArrayList<Pupil> listPupils;

    /**
     * create a classroom and create a empty list of pupils. 
     * Insert a classroom in a database
    */
    public Classroom() {
        listPupils=new ArrayList<Pupil>();
    }
    
    /**
     * add a pupil in listPupils. 
     * Update the classroom in the database
     * @param e the pupil to add
     */
    public void addPupil(Pupil e){
        listPupils.add(e);
    }
    
    /**
     * remove a pupil from listPupils, identified by name and firstName.
     * Update the classroom in the database
     * @param prenom the first of the pupil to remove
     * @param nom the last name of the pupil to remove
     * @return boolean true if pupil found and removed
     */
    public boolean removePupil (String prenom, String nom){
        for (Pupil p : listPupils){
            if (p.getFirstName().equals(prenom) && p.getName().equals(nom)){
                listPupils.remove(p);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Select the list of pupil in the database
     * @return the listPupils
     */
    public ArrayList<Pupil> getListPupils(){
        return listPupils;
    }
}
