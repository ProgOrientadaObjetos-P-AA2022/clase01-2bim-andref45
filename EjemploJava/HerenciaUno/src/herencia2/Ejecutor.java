package herencia2;

import herencia1.EstudianteDistancia;

/**
 *
 * @author andreflores
 */
public class Ejecutor {

    public static void main(String[] args) {
        EstudianteDistancia est = new EstudianteDistancia();
        est.establecerNombresEstudiante("André");
        est.establecerApellidoEstudiante("Flores");
        est.establecerIdentificacionEstudiante("1105312423");
        est.establecerEdadEstudiante(19);
        est.establecerCostoAsignatura(30);
        est.establecerNumeroAsignaturas(5);
        est.calcularMatriculaDistancia();

        /*System.out.printf("%s - (%.2f)\n",
        est.obtenerApellidoEstudiante(),
        est.obtenerMatriculaDistancia());*/
        System.out.printf("%s\n", est);
    }
}
