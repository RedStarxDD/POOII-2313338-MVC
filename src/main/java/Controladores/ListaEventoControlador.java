/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.EventoModelo;
import Vistas.ListaEventoVista;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ListaEventoControlador extends Controller{
    private ListaEventoVista vista;
    private JTable tabla;
    
    @Override
    public void run() {
        tabla=new JTable(getDataColumns(), getNameColumns());
        vista=new ListaEventoVista(this, tabla);
    }
    
    /**
     * Adds a new row in a {@link JTable} with the values informed.
     *
     * @param values Values to be add in {@link JTable}
     */
    public void addNewRow(Object[] values)
    {
        ((DefaultTableModel) tabla.getModel()).addRow(values);
    }
    
    /**
    * Returns the names of the columns of the events list.
    *
    * @return Table metadata in a list
    */
    public Vector<String> getNameColumns()
    {
        // Aquí puede ser lectura de base datos o leer un archivo texto y llevarlo a un modelo
        Vector<String> nameColumns = new Vector<String>();

        nameColumns.add("Descripción");
        nameColumns.add("Email");
        nameColumns.add("Fecha");
        nameColumns.add("Frecuencia");

        return nameColumns;
    }
   
    /**
     * Returns events list data.
     *
     * @return Table data in a list of lists (matrix)
     */
    public Vector<Vector<Object>> getDataColumns()
    {
        Vector<Vector<Object>> dataColumns = null;

        try {
            EventoModelo schedulerIO = new EventoModelo();
            dataColumns = schedulerIO.getEvents();
        } catch (Exception ex) { }

        return dataColumns;
    }

    public ListaEventoVista getVista() {
        return vista;
    }
    
    
}
