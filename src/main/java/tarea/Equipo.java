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
public class Equipo extends Liga {

    private String nombreClub;
    private int victoriasDeLiga=0;

    public Equipo() {

        super();
        this.nombreClub = "nombre";
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombreClub);
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
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.nombreClub, other.nombreClub)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        
        String texto = super.toString();
        return texto + ". Equipo:" + nombreClub + ", victorias" + victoriasDeLiga;
    }

    @Override
    public void esEspañola() {

        if (this.getPaisPertenece().equalsIgnoreCase("españa")) {
            System.out.println("El equipo juega en una liga de ESPAÑA(SIEMPRE ARRIBA)");
        }
    }
    
    public void ganarLiga() {
        victoriasDeLiga++;
    }
    
    
    public void jugarPartido(){
        
        System.out.println("Se va a jugar un partido");
    }
}
