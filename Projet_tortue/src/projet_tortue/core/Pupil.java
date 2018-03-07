
package projet_tortue.core;

import java.util.ArrayList;

/**
 * This class allows to create a Pupil, inherited from a user, with a status of learning and a list of tries
* @author Nathan
* @version 04/03/18
 */
public class Pupil extends User{
    String status;
    ArrayList<Try> listTry;

    /**
     * create a new pupil and create a empty list of try.
     * Interact with the database to add a pupil
     * @param prenom his first name
     * @param nom his last name
     */
    public Pupil(String prenom, String nom) {
        super(prenom, nom);
    }

    /**
     * returns the learning status attribute
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * changes the status of the pupil    
     * @param status the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * return the list of tries
     * @return listTry
     */
    public ArrayList<Try> getListTry(){
        return listTry;
    }
    
    /**
     * Add a try in the list of tries
     * @param t the try to add
     */
    public void addTry(Try t){
        listTry.add(t);
    }
}
