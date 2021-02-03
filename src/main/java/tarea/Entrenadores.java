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
public class Entrenadores extends Equipo{
    
    private double salario;
    private boolean suplente; //true, es suplente
    private int especializacion;

    public Entrenadores() {
        
        super();
        this.salario = 0;
        this.suplente = false;
        this.especializacion = 0;
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

    public int getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(int especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 23 * hash + (this.suplente ? 1 : 0);
        hash = 23 * hash + this.especializacion;
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
        final Entrenadores other = (Entrenadores) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (this.suplente != other.suplente) {
            return false;
        }
        if (this.especializacion != other.especializacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String texto = super.toString();
        return texto + ". Entrenador: " + salario + ", suplente=" + suplente + ", especializacion=" + especializacion + '}';
    }
    
    
}
