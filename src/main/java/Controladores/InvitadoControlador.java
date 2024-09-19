/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import ListaEjercicios2.Evento;
import ListaEjercicios2.Invitado;
import Modelos.EventoModelo;
import Modelos.InvitadoModelo;
import Vistas.EventoVista;
import Vistas.InvitadoVista;
import javax.swing.JOptionPane;

/**
 *
 * @author RedStar
 */
public class InvitadoControlador extends Controller{
    private InvitadoVista vista;

    @Override
    public void run() {
        vista=new InvitadoVista(this);
    }
    
    public void añadirInvitado(Invitado invitado){
        /*Object[] metadata = new Object[5];
        metadata[0] = invitado.getNombre();
        metadata[1] = invitado.getCelular();
        metadata[2] = invitado.getGenero();
        metadata[3] = invitado.getNacimiento();
        metadata[4] = invitado.getDireccion();*/

        try {
            InvitadoModelo modelo=new InvitadoModelo();
            modelo.guardarInvitado(invitado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public InvitadoVista getVista() {
        return vista;
    }
  
}
