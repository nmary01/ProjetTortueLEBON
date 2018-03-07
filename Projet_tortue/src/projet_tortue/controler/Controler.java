/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_tortue.controler;
import projet_tortue.core.*;
import projet_tortue.view.*;

/**
 *
 * @author alexandre
 */
public class Controler {
    private String buffer;//The value of the last code line removed in the script
    private String script;//The code which must be obtained by a pupil or set by a teacher
    private TortueG turtle;//The turtle

    ///////////////////////////////////////////////////////////
    /*
    Construcor for the try class
    By default the turtle is tortueRapide
     */
    public Controler (String script){
        this.script=script;
        this.turtle=new TortueRapide();
        }

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
    public void accelerer (){
        if (turtle instanceof TortueRapide){
            ((TortueRapide)turtle).accelerer();
        }
        addLine("turtle.accelerer();");
    }
    /////////////////////////////////////////
    /*
    Call the avancer method from the tortue and add a line to script corresponding to the method.
    */
    public void avancer (){
        turtle.avancer();
        addLine("turtle.avancer();");
    }
    /////////////////////////////////////////
    /*
    Call the ralentir method from the tortue rapide to increment by one the vitesse and add a line to script corresponding to the method. If the turtle is not a tortue rapide do nothing.
    */

    public void ralentir (){
        if (turtle instanceof TortueRapide)
        {
            ((TortueRapide)turtle).ralentir();
        }
        addLine("turtle.ralentir();");
    }
    //////////////////////////////////////////
    /*
    Call the setCouleur method from the tortue couleur to change the color of the turtle 
    and add a line to script corresponding to the method. If the turtle is not a tortue couleur
    do nothing. coul parameter must be “black”, “red”, “blue”, “green”, “yellow”, “magenta”.

    */
    public void setColor (String color){
        if (turtle instanceof TortueCouleur){  
             ((TortueCouleur)turtle).setCouleur(color);
        }
        addLine("turtle.setCouleur(" + color + ");");
    }
}
