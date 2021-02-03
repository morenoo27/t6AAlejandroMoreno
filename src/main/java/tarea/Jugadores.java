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
public class Jugadores extends Equipo {

    private int posicion;
    private int numDorsal;
    private double salario;
    private boolean suplente; //true = suplente
    private String nacionalidad;

    public Jugadores() {

        super();
        this.numDorsal = 0;
        this.posicion = 0;
        this.salario = 0;
        this.suplente = false;
        this.nacionalidad = "";
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumDorsal() {
        return numDorsal;
    }

    public void setNumDorsal(int numDorsal) {
        this.numDorsal = numDorsal;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isSuplente() {
        return suplente;
    }

    public void setSuplente(boolean suplente) {
        this.suplente = suplente;
    }
    
    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.posicion;
        hash = 37 * hash + this.numDorsal;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 37 * hash + (this.suplente ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.nacionalidad);
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
        final Jugadores other = (Jugadores) obj;
        if (this.posicion != other.posicion) {
            return false;
        }
        if (this.numDorsal != other.numDorsal) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (this.suplente != other.suplente) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String texto = super.toString();
        return texto + ". Jugador: " + posicion + ", dorsal: " + numDorsal + ", salario: " + salario + ", suplente:" + suplente;
    }
    
    @Override
    public void esEspañola() {

        if (this.getNacionalidad().equalsIgnoreCase("españañola")) {
            System.out.println("Este jugador honra a ESPAÑA");
        }
    }
}
