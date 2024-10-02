/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Controladores.ControladorBase;
import java.awt.BorderLayout;
import java.awt.Dimension;
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
    private final static int LARGO = 800;
    private final static int ANCHO = 500;

    public VistaBase(ControladorBase controlador, JFrame frame) {
        this.controlador = controlador;
        this.frame = frame;
        
        frame.setTitle("Eventos");
        //frame.setSize(800, 500);
        frame.setBounds(100, 100, LARGO, ANCHO);
        frame.setMinimumSize(new Dimension(LARGO, ANCHO));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setPreferredSize(new Dimension(LARGO-100, ANCHO-100));
        tabbedPane.addTab("Registro de eventos", controlador.getEventoVista());
        tabbedPane.addTab("Crear eventos", controlador.getListaEventoVista());
        tabbedPane.addTab("Registar invitado", controlador.getInvitadoVista());
        add(tabbedPane, BorderLayout.CENTER);
    }
    

}
