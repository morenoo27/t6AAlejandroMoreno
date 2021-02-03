/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author alejandro
 */
public abstract class Liga {

    private String nombre, paisPertenece;

    public Liga() {
        
        this.nombre="nombre";
        this.paisPertenece = "pais";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisPertenece() {
        return paisPertenece;
    }

    public void setPaisPertenece(String paisPertenece) {
        this.paisPertenece = paisPertenece;
    }

    @Override
    public String toString() {
        return "Liga: " + nombre + ", pais: " + paisPertenece ;
    }
    
    
}
