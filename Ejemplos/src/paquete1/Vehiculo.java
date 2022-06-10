
package paquete1;

/**
 *
 * @author reroes
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculo (String t, String m, double v){
        tipo = t;
        matricula = m;
        valor = v;
    }
    
    public void establecerTipo(String m){
        tipo = m;
    }

    public void establecerMatr(String m){
        matricula = m;
    }
    
    public void establecerValor(double m){
        valor = m;
    }
    
    public String obtenerTipo(){
        return tipo;
    }    
   
    public String obtenerMatr(){
        return matricula;
    } 
    
    public double obtenerValor(){
        return valor;
    }
    
    
    @Override
    public String toString (){
        String reporte = String.format("%s, %s (%.2f)",
                tipo, matricula, valor);
        return reporte;
    }
}
