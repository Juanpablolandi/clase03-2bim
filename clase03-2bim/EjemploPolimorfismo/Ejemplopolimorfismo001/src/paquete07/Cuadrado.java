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
public class Cuadrado extends Figura {
       private double lado;

    public Cuadrado(double lado, String caracteristicas) {
        super(caracteristicas);
        this.lado = lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public void calcular_area() {
        
        this.area = (lado * lado * lado * lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{ " +super.toString()+ " lado= " + lado + '}';
    }
    
}
