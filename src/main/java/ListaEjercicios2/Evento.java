/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEjercicios2;
import java.util.Date;

/**
 *
 * @author milag
 */
public class Evento {
    private String descripcion;
    private String email;
    private String fecha;
    private String frecuencia;
    private boolean recordatorio;
    
    public Evento(){
        
    }

    public Evento(String descripcion, String email, String fecha, String frecuencia, boolean recordatorio) {
        this.descripcion = descripcion;
        this.email = email;
        this.fecha = fecha;
        this.frecuencia = frecuencia;
        this.recordatorio = recordatorio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public boolean isRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(boolean recordatorio) {
        this.recordatorio = recordatorio;
    }

    @Override
    public String toString() {
        return descripcion + ";" + email + ";" + fecha + ";" + frecuencia + ";";
    }
}

