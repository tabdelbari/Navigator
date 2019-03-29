/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;
import navigator.basicobjects.NavObject;

/**
 *
 * @author abdel
 */
public class ObjetsTableModel extends AbstractTableModel{
    
    private final String[] columnsNames= {"Titre","Type","Visiblite"};
    private final Class[] columnsClass= {String.class,String.class,Boolean.class};
    private PaneauNavigation paneauNavigation;

    
    public ObjetsTableModel(PaneauNavigation paneauNavigation) {
        this.paneauNavigation = paneauNavigation;
    }
    

    @Override
    public int getRowCount() {
        return paneauNavigation.getObjetsNavigation().size();
    }

    @Override
    public int getColumnCount() {
        return columnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return paneauNavigation.getObjetsNavigation().get(rowIndex).getTitre();
            case 1:
                return NavObject.types[paneauNavigation.getObjetsNavigation().get(rowIndex).getType()];
            case 2:
                return paneauNavigation.getObjetsNavigation().get(rowIndex).isVisibilite();
            default:return null;
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                paneauNavigation.getObjetsNavigation().get(rowIndex).setTitre((String) aValue);
            case 1:
                break;
            case 2:
                paneauNavigation.getObjetsNavigation().get(rowIndex).setVisibilite((boolean) aValue);
            default:
                paneauNavigation.repaint();
                fireTableCellUpdated(rowIndex, columnIndex);
        }    
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex==1)return false;
        return true;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnsClass[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnsNames[column];
    }
    
    
}
