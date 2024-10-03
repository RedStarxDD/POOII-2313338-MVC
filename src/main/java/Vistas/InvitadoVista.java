/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Controladores.InvitadoControlador;
import ListaEjercicios2.Invitado;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
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
    private JRadioButton btnGeneroM, btnGeneroF;
    private JComboBox<String> cbDia, cbMes,cbAño;
    private JTextField txtDireccion;
    private JCheckBox chkTerminos;
    private JButton btnGuardar, btnLimpiar;  
    
    private final InvitadoControlador controlador;

    public InvitadoVista(InvitadoControlador controlador) {
        this.controlador = controlador;
        
        txtNombre= new JTextField();
        txtCelular = new JTextField();
        btnGeneroM = new JRadioButton();
        btnGeneroF = new JRadioButton();
        cbDia = new JComboBox();
        cbMes = new JComboBox();
        cbAño = new JComboBox();
        txtDireccion = new JTextField();
        chkTerminos = new JCheckBox();
        btnGuardar = new JButton();
        btnLimpiar = new JButton();
        
        setLayout(null);
        crearText(txtNombre, "Ingrese nombre:", 25, 25);
        crearText(txtCelular, "Ingrese número celular", 25, 75);
        
        ArrayList<JRadioButton> botones=new ArrayList<>();
        botones.add(btnGeneroM);
        botones.add(btnGeneroF);
        ArrayList<String> nombresBotones=new ArrayList<>();
        nombresBotones.add("Masculino");
        nombresBotones.add("Femenino");
        crearBtnGroup(botones, nombresBotones, 25, 125);
        
        crearLabel("Fecha de nacimiento", 25,175);
        String[] dias=new String[31];
        for (int i = 1; i <= 31; i++) {
            dias[i-1]=String.valueOf(i);
        }
        crearCmbBox(cbDia, dias, 225, 175);
        
        String[] meses=new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        crearCmbBox(cbMes, meses, 325, 175);
        
        String[] anos=new String[23];
        for (int i = 1; i <= 23; i++) {
            anos[i-1]=String.valueOf(1999+i);
        }
        crearCmbBox(cbAño, anos, 425, 175);
        
        crearText(txtDireccion, "Dirección:", 25, 225);
        
        createChkBox(chkTerminos, "Acepto términos y condiciones", 25, 275);
        
        btnGuardar = new JButton("Registar");
        btnGuardar.setBounds(200, 325, 100, 25);
        add(btnGuardar);
        btnLimpiar = new JButton("Resetear");
        btnLimpiar.setBounds(400, 325, 100, 25);
        add(btnLimpiar);

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
    
    private void crearLabel(String text, int x, int y)
    {
        JLabel lbl = new JLabel(text);
        lbl.setFont(new Font("Tahoma", Font.BOLD, 11));
        lbl.setBounds(x, y, 200, 20);
        add(lbl);
    }
    
    private void crearText(JTextField txtField, String text, int x, int y){
        crearLabel(text, x, y);
        txtField.setBounds(x+200, y, 200, 20);
        add(txtField);
        txtField.setColumns(10);        
    }
    
    private void crearBtnGroup(ArrayList<JRadioButton> lista, ArrayList<String> nombres, int x, int y)
    {
        final ButtonGroup btnGroup = new ButtonGroup();
        crearLabel("Género:", x, y);
        
        for (int i = 0; i < lista.size(); i++) {
            JRadioButton btn = new JRadioButton(nombres.get(i));
            btnGroup.add(btn);
            btn.setBounds((200+x)+i*100, y, 100, 20);
            add(btn);
        }
    }
    
    private void crearCmbBox(JComboBox cmbBox, String[] items, int x, int y){
        cmbBox.setModel(new DefaultComboBoxModel(items));
        cmbBox.setBounds(x, y, 100, 20);
        add(cmbBox);
    }
    
    private void createChkBox(JCheckBox chkBox, String nombre, int x, int y){
        chkBox.setText(nombre);
        chkBox.setBounds(x, y, 200, 25);
        add(chkBox);
    }
    
    private void limpiarCampos() {
        txtNombre.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
        btnGeneroM.setSelected(false);
        btnGeneroF.setSelected(false);
        chkTerminos.setSelected(false);
    }
    
}
