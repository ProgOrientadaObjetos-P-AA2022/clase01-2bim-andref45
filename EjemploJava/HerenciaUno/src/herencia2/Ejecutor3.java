package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Scanner;

/**
 *
 * @author andreflores
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            apellido = entrada.nextLine()
            cedula = entrada.nextLine()
            edad = entrada.nextInt()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        System.out.println("Ingrese 1 para ingresar un Estudiante Distancia:\n"
                + "Ingrese 2 para ingresar un Estudiante Presencial:");
        int op = entrada.nextInt();
        entrada.nextLine();
        EstudianteDistancia estD = new EstudianteDistancia();
        EstudiantePresencial estP = new EstudiantePresencial();

        if (op == 1 || op == 2) {
            System.out.println("Ingrese el nombre del estudiante");
            String nom = entrada.nextLine();

            System.out.println("Ingrese el apellido del estudiante:");
            String ap = entrada.nextLine();

            System.out.println("Ingrese la identificación del estudiante:");
            String id = entrada.nextLine();

            System.out.println("Ingrese la edad del estudiante:");
            int edad = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el costo de asignaturas del "
                            + "estudiante:");
                    double c_asig = entrada.nextDouble();

                    System.out.println("Ingrese el número de asignaturas del "
                            + "estudiante:");
                    int n_asig = entrada.nextInt();
                    estD.establecerNombresEstudiante(nom);
                    estD.establecerApellidoEstudiante(ap);
                    estD.establecerIdentificacionEstudiante(id);
                    estD.establecerEdadEstudiante(edad);
                    estD.establecerCostoAsignatura(c_asig);
                    estD.establecerNumeroAsignaturas(n_asig);
                    estD.calcularMatriculaDistancia();
                    System.out.printf("%s\n", estD);
                    break;

                case 2:
                    System.out.println("Ingrese el número de créditos del "
                            + "estudiante:");
                    int cred = entrada.nextInt();

                    System.out.println("Ingrese el costo de créditos del "
                            + "estudiante:");
                    double c_cred = entrada.nextDouble();

                    estP.establecerNombresEstudiante(nom);
                    estP.establecerApellidoEstudiante(ap);
                    estP.establecerIdentificacionEstudiante(id);
                    estP.establecerEdadEstudiante(edad);
                    estP.establecerNumeroCreditos(cred);
                    estP.establecerCostoCredito(c_cred);
                    estP.calcularMatriculaPresencial();
                    System.out.printf("%s\n", estP);
                    break;
            }
        } else {
            System.out.println("Error, opción no válida.");
        }
    }
}
