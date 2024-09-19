/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import ListaEjercicios2.Evento;
import Modelos.EventoModelo;
import Vistas.EventoVista;
import javax.swing.JOptionPane;


/**
 *
 * @author milag
 */
public class EventoControlador extends Controller{
    private EventoVista vista;
    private final ListaEventoControlador controlador;

    @Override
    public void run() {
        // Pestaña de la tabla de eventos
        vista=new EventoVista(this);
    }

    public EventoControlador(ListaEventoControlador controlador) {
        this.controlador = controlador;
    }
      
    public void añadirEvento(Evento evento){
        Object[] metadata = new Object[4];
        metadata[0] = evento.getDescripcion();
        metadata[1] = evento.getEmail();
        metadata[2] = evento.getFecha();
        metadata[3] = evento.getFrecuencia();

        try {
            EventoModelo modelo=new EventoModelo();
            modelo.guardar(evento);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

        // Agregar a la tabla
        controlador.addNewRow(metadata);
    }

    public EventoVista getVista() {
        return vista;
    }
    
    
}