package Controladores;

import Vistas.View;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.*;

public abstract class Controller {

    //-----------------------------------------------------------------------

    //		Attributes

    //-----------------------------------------------------------------------

    /**

     * Main window of the program.

     */

    protected static final JFrame mainFrame = new JFrame();



    /**

     * Stores all views that can be loaded in the main window.

     */

    private static final JPanel viewsViewer = new JPanel(new CardLayout());



    //-----------------------------------------------------------------------

    //		Methods

    //-----------------------------------------------------------------------

    /**

     * Executes controller and associated view with it.

     */

    public abstract void run();


    /**
     * Adds a view in main frame.
     *
     * @param viewName Name of the view
     * @param view View to be added
     */
    public static void addView(String viewName, View view)
    {
        viewsViewer.add((Component)view, viewName);
    }





}