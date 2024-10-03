/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import ListaEjercicios2.Invitado;
import java.util.Vector;

/**
 *
 * @author RedStar
 */
public class InvitadoModelo extends Modelo{
    
     /**
     * Saves a {@link SchedulerEvent} in disk in {@link #DIRECTORY}.{@link #FILE}.
     *
     * @param invitado {@link SchedulerEvent Event} to be saved
     * @throws Exception If it can't save the event
     */
    public void guardarInvitado(Invitado invitado) throws Exception
    {
        guardar(invitado, "invitados.txt");
    }
    
    /**
     * Reads a {@link SchedulerEvent} saved in disk with name {@link #FILE}.
     * @return List of lists (matrix) of the events
     * @throws Exception If it can't read event file
     */
    public Vector<Vector<Object>> getEvents() throws Exception
    {
        return Modelo.getEvents(3);
    }

}
