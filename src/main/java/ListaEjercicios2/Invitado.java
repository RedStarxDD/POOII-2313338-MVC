/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEjercicios2;

/**
 *
 * @author RedStar
 */
public class Invitado {
    private String nombre, celular, nacimiento, direccion;
    private int genero;

    public Invitado() {
    }
    
    public Invitado(String nombre, String celular, String nacimiento, String direccion, int genero) {
        this.nombre = nombre;
        this.celular = celular;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        String gen="";
        if(genero==0){
            gen="Masculino";
        }else if(genero==1){
            gen="Femenino";
        }
        return nombre + ";" + celular + ";" + gen + ";" + nacimiento + ";" + direccion + ";";
    }

}
