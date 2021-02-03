/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.paisPertenece);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Liga other = (Liga) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.paisPertenece, other.paisPertenece)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Liga: " + nombre + ", pais: " + paisPertenece ;
    }
    
    
}
