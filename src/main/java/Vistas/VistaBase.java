/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Controladores.ControladorBase;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author user
 */
public class VistaBase extends JPanel{
    private final ControladorBase controlador;
    private final JFrame frame;

    public VistaBase(ControladorBase controlador, JFrame frame) {
        this.controlador = controlador;
        this.frame = frame;
        
        frame.setTitle("Eventos");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.addTab("Registro de eventos", controlador.getEventoVista());
        tabbedPane.addTab("Crear eventos", controlador.getListaEventoVista());
        tabbedPane.addTab("Registar invitado", controlador.getInvitadoVista());
        add(tabbedPane, BorderLayout.CENTER);
    }
    

}
