/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import ListaEjercicios2.Evento;
import ListaEjercicios2.Invitado;
import static Modelos.Modelo.guardar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

/**
 *
 * @author user
 */
public class EventoModelo{
    
     /**
     * Saves a {@link SchedulerEvent} in disk in {@link #DIRECTORY}.{@link #FILE}.
     *
     * @param invitado {@link SchedulerEvent Event} to be saved
     * @throws Exception If it can't save the event
     */
    public void guardarEvento(Evento evento) throws Exception
    {
        guardar(evento, "eventos.txt");
    }
    
    /**
     * Reads a {@link SchedulerEvent} saved in disk with name {@link #FILE}.
     * @return List of lists (matrix) of the events
     * @throws Exception If it can't read event file
     */
    public Vector<Vector<Object>> getEvents() throws Exception
    {
        return Modelo.getEvents(4);
    }
    
}
