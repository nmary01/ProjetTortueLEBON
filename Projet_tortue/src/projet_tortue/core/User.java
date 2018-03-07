package projet_tortue.core;

/**
 * The class User allows to create an user with a first name and a last name. Teacher and Pupil inherit from this class
 * @author Nathan
 * @version 04/03/18
 */
public class User {
    
    //name is last name of the user, firstName is his first name.
    String name, firstName;

    /**
     * create a new user and interact with the database
     * @param prenom The first name
     * @param nom The last name
     */
    public User(String prenom, String nom) {
        this.name = nom;
        this.firstName = prenom;
    }

    /**
     * returns the last name attribute
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * changes the last name of the user
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns the first name attribute
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * changes the first name of the user
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
}
