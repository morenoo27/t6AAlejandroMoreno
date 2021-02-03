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
public class Jugadores extends Equipo {

    private int posicion;
    private int numDorsal;
    private double salario;
    private boolean suplente; //true = suplente

    public Jugadores() {

        super();
        this.numDorsal = 0;
        this.posicion = 0;
        this.salario = 0;
        this.suplente = false;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.posicion;
        hash = 59 * hash + this.numDorsal;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 59 * hash + (this.suplente ? 1 : 0);
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
        return true;
    }

    @Override
    public String toString() {
        String texto = super.toString();
        return texto + ". Jugador: " + posicion + ", dorsal: " + numDorsal + ", salario: " + salario + ", suplente:" + suplente;
    }
}
