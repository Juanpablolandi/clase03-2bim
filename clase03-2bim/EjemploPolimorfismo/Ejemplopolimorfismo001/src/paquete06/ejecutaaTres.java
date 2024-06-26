package paquete06;

public class ejecutaaTres {
    public static void main(String[] args) {
        String nombre = "Juan";
        String apellido = "Landi";
        EstudianteDistancia e = new EstudianteDistancia(5,10,nombre,apellido);
        e.establecerIdentificacionEstudiante("1150006524");
        e.establecerEdadEstudiante(18);
        e.calcularMatricula();
        System.out.println("\n" + e);
    }
}
