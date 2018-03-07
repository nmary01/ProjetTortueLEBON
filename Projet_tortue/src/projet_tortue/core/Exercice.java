/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_tortue.core;

import java.util.ArrayList;

/**
 *This class  represent an exercise with a reference and the tries of pupils.        
 * @author skaering
 */
public class Exercice {
    private ArrayList<Try> listOfTry;// the liste of try made by all the pupil
    private Reference theReference; // the refference for an exercice
    private String name;
/*
   reate an exercise with the reference for pupils. Insert in the database the exercise
 
*/
public Exercice  (Reference theReference, String name){
this.theReference=theReference;
this.name=name;

} 
/*
This method allow to add a try made by a pupil in an exercise and in the database
instert also in the database 

*/
public void addTry (Try newTry){
listOfTry.add(newTry);}

////////////////////////////////////////////////////////:
/*
This method return the list of the differents  try for one exercise 
@return ArrayList<Try> listOfTry 
*/
public ArrayList<Try> getListTry (){
return listOfTry;}

////////////////////////////////////////////////////////:
/*
This method return the reference of the exercise 
@return Reference theReference 
*/
public Reference getReference (){
return theReference;}
///////////////////////////////////////////////////////
/*
This method allow to modify a reference
@param Reference theReference
*/
public void changeReference(Reference theReference){
this.theReference=theReference;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}