/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_tortue.core;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nathan
 */
public class Tableau1Exo extends AbstractTableModel {
    private List<Pupil> eleves = new ArrayList<Pupil>();
 
    private final String[] entetes = {"Exo n°","Prenom", "Nom", "Tentative n°", "Graduation", "Appreciation"};
 
    public Tableau1Exo() {
        super();

 
        eleves.add(new Pupil("Nathan","MARY"));
        eleves.add(new Pupil("Paul", "Jean"));
    }
 
    public int getRowCount() {
        return eleves.size();
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return eleves.get(rowIndex).getListTry().get(0).getEx().getName();
            case 1:
                return eleves.get(rowIndex).getFirstName();
            case 2:
                return eleves.get(rowIndex).getName();
            case 3:
                return eleves.get(rowIndex).getListTry().get(0).getGraduation();
            case 4:
                return eleves.get(rowIndex).getListTry().get(0).getAppreciation();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
 
    public void addPupil(Pupil ami) {
        eleves.add(ami);
 
        fireTableRowsInserted(eleves.size() -1, eleves.size() -1);
    }
 
    public void removePupil(int rowIndex) {
        eleves.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    /*public void showClass (Noeud laClasse){
        int nbPupil = laClasse.getNbfils();
        Pupil eleveTemp;
        ArrayList<Pupil> tempList = new ArrayList<Pupil>();
        for (int i=0; i<nbPupil; i++){
            eleveTemp = (Pupil)laClasse.getEnfantNum(i).getContenu();
            System.out.println(eleveTemp);
            tempList.add(eleveTemp);
        }
        eleves=tempList;
    }*/
}

