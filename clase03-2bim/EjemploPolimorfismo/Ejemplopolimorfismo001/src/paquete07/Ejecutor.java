/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        /*
        =============================
        INTEGRANTES:
        RICARDO ESPINOSA
        JUAN DIEGO GUERRERO
        JUAN PABLO LANDI
        =============================
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        
        // inicio de la solución
        ArrayList<Figura> figu = new ArrayList<>();
        figu.add(new Cuadrado(4, "Cuadrado"));
        figu.add(new Cuadrado(5,"Cuadrado"));
        figu.add(new Cuadrado(6,"Cuadrado"));
        figu.add(new Cuadrado(7,"Cuadrado"));
        figu.add(new Rombo(2,2,"Rombo"));
        figu.add(new Rombo(3,3,"Rombo"));
        figu.add(new Rombo(4,4,"Rombo"));
        figu.add(new Triangulo(2,2,"Triangulo"));
        figu.add(new Triangulo(3,3,"Triangulo"));
        figu.add(new Triangulo(4,4,"Triangulo"));
        figu.add(new Triangulo(5,5,"Triangulo"));
        figu.add(new Triangulo(6,6,"Triangulo"));
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figu.size(); i++) {
            // 1.  
            figu.get(i).calcular_area();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figu.get(i));
        }
    }
}
