/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import ListaEjercicios2.Invitado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author RedStar
 */
public abstract class Modelo {
    private static final String DIRECTORY = ".";
    private static String FILE = "";
    private static String notice;
    
    public static void guardar(Object objeto, String file) throws Exception
    {
        FILE=file;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(DIRECTORY, FILE), true));
            writer.write(objeto.toString(), 0, objeto.toString().length());
            writer.newLine();
            writer.close();
        } catch (FileNotFoundException fnfe) {
            notice = "File not found";
            //notifyViews();
        } catch (IOException ex) {
            notice = "Error while writing the file";
            //notifyViews();
        }
    }
    
    /**
     * Reads a {@link SchedulerEvent} saved in disk with name {@link #FILE}.
     * @return List of lists (matrix) of the events
     * @throws Exception If it can't read event file
     */
    public static Vector<Vector<Object>> getEvents(int numTokens) throws Exception
    {
        Vector<Vector<Object>> response = new Vector<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(DIRECTORY, FILE)));
            String line = reader.readLine();

            while (line != null) {
                Vector<Object> eventInfo = new Vector<Object>();
                String[] tokens = line.split(";");
                
                for (int i = 0; i <= numTokens; i++) {
                    eventInfo.add(tokens[i]);
                }

                response.add(eventInfo);
                line = reader.readLine();
            }

            reader.close();
        } catch (FileNotFoundException fnfe) {
            notice = "File not found";
            //notifyViews();
        } catch (IOException ex) {
            notice = "There was a problem reading the event file";
            //notifyViews();
        }

        return response;
    }
}
