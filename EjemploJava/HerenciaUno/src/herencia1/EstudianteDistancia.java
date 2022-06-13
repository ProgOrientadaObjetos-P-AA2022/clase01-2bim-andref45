package herencia1;

public class EstudianteDistancia extends Estudiante {

    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
        matriculaDistancia: Real*/
    //  Métodos establecer y calcular para los datos o atributos de la clase
    int numeroAsignaturas;
    double costoAsignatura;
    double matriculaDistancia;

    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsignaturas(int numero) {
        numeroAsignaturas = numero;
    }

    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor) {
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia() {
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas() {
        return numeroAsignaturas;
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura() {
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia() {
        return matriculaDistancia;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %d\n"
                + "Número de asignaturas: %d\n"
                + "Costo de asignaturas: %.2f\n"
                + "Matrícula: %.1f\n",
                obtenerNombresEstudiante(),
                obtenerApellidoEstudiante(),
                obtenerIdentificacionEstudiante(),
                edadEstudiante,
                obtenerNumeroAsignaturas(),
                obtenerCostoAsignatura(),
                obtenerMatriculaDistancia());
        return reporte;
    }

}
