
package paquete1;

/**
 *
 * @author reroes
 */
public class Edificio {
    private String nombre;
    private double costo;
    
    public Edificio(String m){
        nombre = m;
    }
    
    public void establecerNombre(String m){
        nombre = m;
    }

    public void establecerCostos(double m){
        costo = m;
    }
    
    public String obtenerNombre(){
        return nombre;
    }    
   
    public double obtenerCosto(){
        return costo;
    }    
    
    @Override
    public String toString (){
        String reporte = String.format("%s (%.2f)",
                nombre, costo);
        return reporte;
    }
}
