/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import ListaEjercicios2.Evento;
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
    private static final String DIRECTORY = ".";
    private static final String FILE = "eventos.txt";
    private String notice;
    
     /**
     * Saves a {@link SchedulerEvent} in disk in {@link #DIRECTORY}.{@link #FILE}.
     *
     * @param event {@link SchedulerEvent Event} to be saved
     * @throws Exception If it can't save the event
     */
    public void guardar(Evento event) throws Exception
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(DIRECTORY, FILE), true));
            writer.write(event.toString(), 0, event.toString().length());
            writer.newLine();
            writer.close();
        } catch (FileNotFoundException fnfe) {
            notice = "File not found";
            //notifyViews();
        } catch (Exception ex) {
            notice = "Error while writing the file";
            //notifyViews();
        }
    }
    
    /**
     * Reads a {@link SchedulerEvent} saved in disk with name {@link #FILE}.
     * @return List of lists (matrix) of the events
     * @throws Exception If it can't read event file
     */
    public Vector<Vector<Object>> getEvents() throws Exception
    {
        Vector<Vector<Object>> response = new Vector<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(DIRECTORY, FILE)));
            String line = reader.readLine();

            while (line != null) {
                Vector<Object> eventInfo = new Vector<Object>();
                String[] tokens = line.split(";");

                eventInfo.add(tokens[0]);
                eventInfo.add(tokens[1]);
                eventInfo.add(tokens[2]);
                eventInfo.add(tokens[3]);

                response.add(eventInfo);
                line = reader.readLine();
            }

            reader.close();
        } catch (FileNotFoundException fnfe) {
            notice = "File not found";
            //notifyViews();
        } catch (Exception ex) {
            notice = "There was a problem reading the event file";
            //notifyViews();
        }

        return response;
    }

}
