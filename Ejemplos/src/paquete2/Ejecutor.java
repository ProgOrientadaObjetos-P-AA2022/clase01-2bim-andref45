package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(10000);

        Edificio edf2 = new Edificio("Edificio Sur");
        edf2.establecerCostos(20000);

        Edificio edf3 = new Edificio("Edificio Norte");
        edf3.establecerCostos(30000);

        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(20000);

        /*Edificio[] edificios = new Edificio[4];
        edificios[0] = edf1;
        edificios[1] = edf2;
        edificios[2] = edf3;
        edificios[3] = edf4;*/
        Edificio[] edificios = {edf1, edf2, edf3, edf4};
        //System.out.println(edf1);
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(edificios);
        miempresa.establecerCostoBienesInmuebles();
        //System.out.printf("%.2f\n", miempresa.obtenerCostoBienesInmuebles());
        // Imprimir el costo de los bienes inmuebles de la empresa
        System.out.printf("%s\n", miempresa);
    }
}
