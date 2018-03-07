/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_tortue.core;

import java.util.ArrayList;

/**
 *This class  represent a reference created by a teacher and what a pupil must do. It contains the image and the script to do it.    
 * @author skaering
 */
public class Reference {
    private String buffer;//The value of the last code line removed in the script
    private String script;//The code which must be obtained by a pupil or set by a teacher

///////////////////////////////////////////////////////////
/*
Construcor for the try class   
 */
public Reference (String script){
this.script=script;}

///////////////////////////////////////////////////////////
/*
this method allow to add a line in the script 
@param  String line : the line to add in the script
*/
public void  addLine (String line){
    script= script+ line+"\n";} 
///////////////////////////////////////////////////////////
/*
 This methode allow to remove à line and fill the buffer with the removed line  
 @param string line :the line to remove 
 */
public void removeLine (String line){
   String[] theScript = script.split("\n");
  if(theScript[-1].equals(line)){
    StringBuilder sb = new StringBuilder();
    buffer=line;
    for(int i=0; i<theScript.length-1;i++){
        sb.append(theScript[i]);
        sb.append("\n");
    }
    script=sb.toString();}
  } 
///////////////////////////////////////////////////////////
/*
 This methode allow to return the Script 
 @return string script 
 */
 public String getScript(){
     return script;
 } 
 ///////////////////////////////////////////////////////////
 /*
 *This methode allow to modify a the script og a try 
 @param script the script to set
 */
 public void setScript(String script){
 this.script=script;}
 /////////////////////////////////////////////////////////
 /*
 This methode allow to return the buffer 
 @return string buffer 
 */
 public String getBuffer (){
 return buffer;}

/////////////////////////////////////////////////////////
 /*
 This methode allow to destroy a Reference in the database if nobody has try it 
 */
public void destroyReference (){}
/////////////////////////////////////
/*
Call the accelerer method from the tortue rapide and add a line to script corresponding to the method, if it is not the tortue rapide, do nothing..
*/
public void accelerer (){}
/////////////////////////////////////////
/*
Call the avancer method from the tortue and add a line to script corresponding to the method.
*/
public void avancer (){}
/////////////////////////////////////////
/*
Call the setVitesse method from the tortue rapide to increment by one the vitesse and add a line to script corresponding to the method. If the turtle is not a tortue rapide do nothing.
*/
public void addVitesse (){}
/////////////////////////////////////////
/*
Call the ralentir method from the tortue rapide to increment by one the vitesse and add a line to script corresponding to the method. If the turtle is not a tortue rapide do nothing.
*/

public void ralentir (){}
//////////////////////////////////////////
/*
Call the setCouleur method from the tortue couleur to change the color of the turtle 
and add a line to script corresponding to the method. If the turtle is not a tortue couleur
do nothing. coul parameter must be “black”, “red”, “blue”, “green”, “yellow”, “magenta”.

*/
public void setColor (){}
}