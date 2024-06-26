/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

public class EstudianteDistancia extends Estudiante {
    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
    */ 
    
    int numeroAsignaturas;
    double costoAsignatura;

    public EstudianteDistancia(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public EstudianteDistancia(int numeroAsignaturas, double costoAsignatura, String nombre, String apellido) {
        super(nombre, apellido);
        this.numeroAsignaturas = numeroAsignaturas;
        this.costoAsignatura = costoAsignatura;
    }
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    @Override
    public void calcularMatricula(){
        matricula = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }

    @Override
    public String toString() {
        return "EstudianteDistancia{" + super.toString() + "numeroAsignaturas=" + numeroAsignaturas + ", costoAsignatura=" + costoAsignatura + '}';
    }
    
}
