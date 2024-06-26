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
public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String caracteristicas) {
        super(caracteristicas);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public void calcular_area() {
        this.area=((base*altura)/2);
    }

    @Override
    public String toString() {
        return "Triangulo{ " +super.toString()+ " base= " + base + ", altura= " + altura + '}';
    }
    
}
