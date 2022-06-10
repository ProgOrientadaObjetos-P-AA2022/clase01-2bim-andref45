/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private double costoBienesInmuebles;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    public void establecerCostoBienesInmuebles(){
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma += edificios[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    public double obtenerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }
    
    @Override 
    public String toString(){
        String cadena = String.format("%s\nLista de edificios:\n", 
                nombre);
        for (int i = 0; i < edificios.length; i++) {
            cadena = String.format("%s%d. %s (%.0f)\n", 
                    cadena,(i+1), edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        cadena = String.format("%sTotal de inmuebles: %.0f",
                cadena, costoBienesInmuebles);
        return cadena;
    }
}
