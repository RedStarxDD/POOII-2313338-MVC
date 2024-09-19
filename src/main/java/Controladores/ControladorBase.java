/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.EventoVista;
import Vistas.InvitadoVista;
import Vistas.ListaEventoVista;
import Vistas.VistaBase;

/**
 *
 * @author user
 */
public class ControladorBase extends Controller{
    private final ListaEventoControlador listaEventoControlador=new ListaEventoControlador();
    private final EventoControlador eventoControlador=new EventoControlador(listaEventoControlador);
    private final InvitadoControlador invitadoControlador=new InvitadoControlador();

    @Override
    public void run() {
        eventoControlador.run();
        listaEventoControlador.run();
        invitadoControlador.run();
        
        VistaBase vista = new VistaBase(this, mainFrame);
        mainFrame.add(vista);
        //addView("Vista base", vista);

        // Displays the program window
        mainFrame.setVisible(true);

    }
    
    public EventoVista getEventoVista(){
        return eventoControlador.getVista();
    }
    
    public ListaEventoVista getListaEventoVista(){
        return listaEventoControlador.getVista();
    }
    
    public InvitadoVista getInvitadoVista(){
        return invitadoControlador.getVista();
    }
}
