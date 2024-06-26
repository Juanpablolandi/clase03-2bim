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
public class Rombo extends Figura{
    private double diagonal_mayor;
    private double diagonal_menor;

    public Rombo(double diagonalMayor, double diagonalMenor, String caracteristicas) {
        super(caracteristicas);
        this.diagonal_mayor = diagonalMayor;
        this.diagonal_menor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonal_mayor;
    }

    public double getDiagonalMenor() {
        return diagonal_menor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonal_mayor = diagonalMayor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonal_menor = diagonalMenor;
    }
    @Override
    public void calcular_area() {
        this.area = ((diagonal_mayor*diagonal_menor)/2);
    }

    @Override
    public String toString() {
        return "Rombo{ " + super.toString() + " diagonalMayor= " + diagonal_mayor + ", diagonalMenor= " + diagonal_menor + '}';
    }
    
}
