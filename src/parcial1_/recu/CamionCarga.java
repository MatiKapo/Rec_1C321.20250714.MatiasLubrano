/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1_.recu;

/**
 *
 * @author Matias
 */
public class CamionCarga extends Vehiculo{
    
    private int capacidadCarga;

    public CamionCarga(String patente, String marca, int anioFabricacion, int capacidadCarga) {
        super(patente, marca, anioFabricacion);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public String toString() {
        return "CamionCarga: " + "Patente: " + super.getPatente() + " --- Marca: " + super.getMarca() + " --- Anio de Fabricacion: " + super.getAnioFabricacion() + " --- Carga: " + capacidadCarga;
    }
    
    @Override
    public void Recorrer() {
        System.out.println("Iniciando recorrido del camion de carga de patente: " + super.getPatente());
    }
    
    
    
    
    
    
    
    
}
