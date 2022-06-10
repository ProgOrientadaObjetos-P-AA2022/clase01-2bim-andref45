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
    private Edificio[] edificios;
    private Vehiculo[] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerVehiculos(Vehiculo[] m) {
        vehiculos = m;
    }

    public void establecerCostoBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma += edificios[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    
    public void establecerCostoVehiculo() {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            suma += vehiculos[i].obtenerValor();
        }
        costoVehiculos= suma;
    }
    
    public void establecerCostoTotal(){
        costoTotalBienes = costoVehiculos + costoBienesInmuebles;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }
    
    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }
    
    public double obtenerCostoVehiculos() {
        return costoVehiculos;
    }
    
    public double obtenerCostoTotal() {
        return costoTotalBienes;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s\nLista de Edificios:\n",
                nombre);
        for (int i = 0; i < edificios.length; i++) {
            cadena = String.format("%s%d. %s (%.0f)\n",
                    cadena,
                    i + 1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        cadena = String.format("%sTotal de inmuebles: %.0f\n"
                + "Lista de Vehículos:\n", cadena,
                nombre);
        for (int i = 0; i < vehiculos.length; i++) {
            cadena = String.format("%s%d. %s, %s (%.0f)\n",
                    cadena,
                    i + 1,
                    vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatr(),
                    vehiculos[i].obtenerValor());
        }
        cadena = String.format("%sTotal de inmuebles: %.0f\n"
                + "\nTotal bienes: %0.f\n",
                cadena,
                costoVehiculos, costoTotalBienes);
        
        
        return cadena;
    }
}
