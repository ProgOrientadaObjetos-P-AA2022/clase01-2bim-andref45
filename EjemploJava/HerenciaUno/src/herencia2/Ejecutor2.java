package herencia2;

import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        EstudianteDistancia est = new EstudianteDistancia();

        System.out.println("Ingrese el nombre del estudiante:");
        String nom = entrada.nextLine();
        est.establecerNombresEstudiante(nom);

        System.out.println("Ingrese el apellido del estudiante:");
        String ap = entrada.nextLine();
        est.establecerApellidoEstudiante(ap);

        System.out.println("Ingrese la identificación del estudiante:");
        String id = entrada.nextLine();
        est.establecerIdentificacionEstudiante(id);

        System.out.println("Ingrese la edad del estudiante:");
        int edad = entrada.nextInt();
        est.establecerEdadEstudiante(edad);

        System.out.println("Ingrese el costo de las asignaturas:");
        double cost = entrada.nextDouble();
        est.establecerCostoAsignatura(cost);

        System.out.println("Ingrese el número de asignaturas:");
        int n_asig = entrada.nextInt();
        est.establecerNumeroAsignaturas(n_asig);

        est.calcularMatriculaDistancia();

        System.out.printf("%s\n", est);
    }
}
