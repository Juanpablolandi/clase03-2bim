/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
public abstract class Figura {
    protected String caracteristicas;
    protected double area;

    public Figura(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public abstract void calcular_area();

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public double getArea() {
        return area;
    }
    
    
    @Override
    public String toString() {
        return "Figura{" + "caracteristicas=" + getCaracteristicas() + ", area=" + getArea() + '}';
    }
    
}
