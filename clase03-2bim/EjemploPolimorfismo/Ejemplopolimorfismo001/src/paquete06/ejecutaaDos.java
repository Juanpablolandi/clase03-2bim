package paquete06;

public class ejecutaaDos {
    public static void main(String[] args) {
        String nombre = "Juan";
        String apellido = "Landi";
        EstudianteDistancia e = new EstudianteDistancia(nombre,apellido);
        e.establecerIdentificacionEstudiante("1150006524");
        e.establecerEdadEstudiante(18);
        e.establecerNumeroAsginaturas(10);
        e.establecerCostoAsignatura(100);
        e.calcularMatricula();
        System.out.println("\n" + e);
    }
}
