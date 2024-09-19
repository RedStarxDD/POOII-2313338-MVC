/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Controladores.ListaEventoControlador;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author user
 */
public class ListaEventoVista extends JPanel{
    private final ListaEventoControlador controlador;
    private JTable tablaEventos;

    public ListaEventoVista(ListaEventoControlador controlador, JTable tabla) {   
        this.controlador=controlador;
        this.tablaEventos = tabla;
        
        JScrollPane scrollTabla = new JScrollPane(tablaEventos);

        add(scrollTabla);
    }
}
