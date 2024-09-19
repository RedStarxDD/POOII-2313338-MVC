/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;
import Controladores.EventoControlador;
import ListaEjercicios2.Evento;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author milag
 */
public class EventoVista extends JPanel{
    private JTextField txtDescripcion, txtEmail, txtFecha;
    private JComboBox<String> cbFrecuencia;
    private JCheckBox chkFrecuencia;
    private JButton btnGuardar, btnLimpiar;  
    
    private final EventoControlador controlador;

    public EventoVista(EventoControlador controlador) {
        // Pestaña de registro de eventos
        JPanel panelRegistro = new JPanel(new GridLayout(5, 2));
        txtDescripcion = new JTextField();
        txtEmail = new JTextField();
        txtFecha = new JTextField();
        cbFrecuencia = new JComboBox<>(new String[] {"Diaria", "Semanal", "Mensual"});
        chkFrecuencia = new JCheckBox("Repetir Evento");
        btnGuardar = new JButton("Guardar");
        btnLimpiar = new JButton("Limpiar");
        
        panelRegistro.add(new JLabel("Descripción:"));
        panelRegistro.add(txtDescripcion);
        panelRegistro.add(new JLabel("Email:"));
        panelRegistro.add(txtEmail);
        panelRegistro.add(new JLabel("Fecha:"));
        panelRegistro.add(txtFecha);
        panelRegistro.add(new JLabel("Frecuencia:"));
        panelRegistro.add(cbFrecuencia);
        panelRegistro.add(chkFrecuencia);
        panelRegistro.add(btnGuardar);
        panelRegistro.add(btnLimpiar);
        add(panelRegistro);
        
        this.controlador=controlador;
        
        btnGuardar.addActionListener((e) -> {
            Evento evento=new Evento();
            evento.setDescripcion(txtDescripcion.getText());
            evento.setEmail(txtEmail.getText());
            evento.setFecha(txtFecha.getText());
            evento.setFrecuencia((String) cbFrecuencia.getSelectedItem());

            controlador.añadirEvento(evento);
            limpiarCampos();
        });
    }
  
   // Método para limpiar los campos de entrada
    private void limpiarCampos() {
        txtDescripcion.setText("");
        txtEmail.setText("");
        txtFecha.setText("");
        cbFrecuencia.setSelectedIndex(0);
        chkFrecuencia.setSelected(false);
    }
}


