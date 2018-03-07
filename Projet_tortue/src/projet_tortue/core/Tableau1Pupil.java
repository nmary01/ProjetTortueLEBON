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
public class Tableau1Pupil extends AbstractTableModel {
    private List<Try> tentatives = new ArrayList<Try>();
 
    private final String[] entetes = {"Exo n°", "Date", "Graduation", "Appreciation"};
 
    public Tableau1Pupil() {
        super();

        Exercice exo=new Exercice((new Reference ("Code reference1")),"Nom Exo1");
        tentatives.add(new Try(exo,"Code Try1","2018-03-07"));
        tentatives.add(new Try(exo,"Code Try2","2018"));
    }
 
    public int getRowCount() {
        return tentatives.size();
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
                return tentatives.get(rowIndex).getEx().getName();
            case 1:
                return tentatives.get(rowIndex).getDate();
            case 2:
                return tentatives.get(rowIndex).getGraduation();
            case 3:
                return tentatives.get(rowIndex).getAppreciation();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
 
    public void addPupil(Try t) {
        tentatives.add(t);
 
        fireTableRowsInserted(tentatives.size() -1, tentatives.size() -1);
    }
 
    public void removePupil(int rowIndex) {
        tentatives.remove(rowIndex);
 
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
        tentatives=tempList;
    }*/
}

