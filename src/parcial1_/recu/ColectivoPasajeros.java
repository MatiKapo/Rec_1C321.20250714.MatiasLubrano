/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1_.recu;

/**
 *
 * @author Matias
 */
public class ColectivoPasajeros extends Vehiculo{
    
    private int cantidadPasajeros;

    public ColectivoPasajeros(String patente, String marca, int anioFabricacion, int cantidadPasajeros) {
        super(patente, marca, anioFabricacion);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "ColectivoPasajeros: " + "Patente: " + super.getPatente() + " --- Marca: " + super.getMarca() + " --- Anio de Fabricacion: " + super.getAnioFabricacion() + " --- Carga: " + cantidadPasajeros;
    }

    @Override
    public void Recorrer() {
        System.out.println("Iniciando recorrido del colectivo de pasajeros de patente: " + super.getPatente());
    }
    
    
    
    
    
}
