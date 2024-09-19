/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Controladores.InvitadoControlador;
import ListaEjercicios2.Invitado;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author RedStar
 */
public class InvitadoVista extends JPanel{
    private JTextField txtNombre, txtCelular;
    private JRadioButton btnGeneroM;
    private JRadioButton btnGeneroF;
    private JComboBox<String> cbDia;
    private JComboBox<String> cbMes;
    private JComboBox<String> cbAño;
    private JTextField txtDireccion;
    private JCheckBox chkFrecuencia;
    private JButton btnGuardar, btnLimpiar;  
    
    private final InvitadoControlador controlador;

    public InvitadoVista(InvitadoControlador controlador) {
        this.controlador = controlador;
        
        JPanel panelRegistro = new JPanel(new GridLayout(5, 2));
        txtNombre= new JTextField();
        txtCelular = new JTextField();
        btnGeneroM = new JRadioButton();
        btnGeneroF = new JRadioButton();
        cbDia = new JComboBox<>(new String[] {"1", "2", "3", "4","5","6","7","8", "9", "10", "11","12","13","14","15"});
        cbMes = new JComboBox<>(new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"});
        cbAño = new JComboBox<>(new String[]{"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"});
        txtDireccion = new JTextField();
        chkFrecuencia = new JCheckBox("Aceptar términos y condiciones");
        btnGuardar = new JButton("Registar");
        btnLimpiar = new JButton("Resetear");
        
        panelRegistro.add(new JLabel("Ingrese nombre:"));
        panelRegistro.add(txtNombre);
        panelRegistro.add(new JLabel("Ingrese número celular:"));
        panelRegistro.add(txtCelular);
        panelRegistro.add(new JLabel("Género:"));
        panelRegistro.add(btnGeneroM);
        panelRegistro.add(new JLabel("Masculino"));
        panelRegistro.add(btnGeneroF);
        panelRegistro.add(new JLabel("Femenino"));
        panelRegistro.add(new JLabel("Fecha de nacimiento:"));
        panelRegistro.add(cbDia);
        panelRegistro.add(cbMes);
        panelRegistro.add(cbAño);
        panelRegistro.add(new JLabel("Dirección:"));
        panelRegistro.add(txtDireccion);
        panelRegistro.add(chkFrecuencia);
        panelRegistro.add(btnGuardar);
        panelRegistro.add(btnLimpiar);
        add(panelRegistro);
       
        
 
        
        btnGuardar.addActionListener((e) -> {
            Invitado invitado=new Invitado();
            invitado.setNombre(txtNombre.getText());
            invitado.setCelular(txtCelular.getText());
            if(btnGeneroM.isSelected()){
                invitado.setGenero(0);
            }else{
                invitado.setGenero(1);
            }
            invitado.setNacimiento(cbDia.getSelectedItem()+"/"+cbMes.getSelectedItem()+"/"+cbAño.getSelectedItem());
            invitado.setDireccion(txtDireccion.getText());
            
            controlador.añadirInvitado(invitado);
            limpiarCampos();
        });     
    }
    
    private void limpiarCampos() {
        txtNombre.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
        btnGeneroM.setSelected(false);
        btnGeneroF.setSelected(false);
        chkFrecuencia.setSelected(false);
    }
    
}
