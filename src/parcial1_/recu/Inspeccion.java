/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1_.recu;

/**
 *
 * @author Matias
 */
public class Inspeccion extends Vehiculo{
    
    private String usoAsignado;

    public Inspeccion(String patente, String marca, int anioFabricacion, String usoAsignado) {
        super(patente, marca, anioFabricacion);
        this.usoAsignado = usoAsignado;
    }

    public String getUsoAsignado() {
        return usoAsignado;
    }

    @Override
    public String toString() {
        return "VehiculoInspeccion: " + "Patente: " + super.getPatente() + " --- Marca: " + super.getMarca() + " --- Anio de Fabricacion: " + super.getAnioFabricacion() + " --- Uso: " + usoAsignado;
    }

    @Override
    public void Recorrer() {
        System.out.println("El vehiculo con la pantente " + super.getPatente() + " es de tipo inspeccion, por lo cual no se ha iniciado su recorrido");
    }

   
    
    
    
    
    
    
}
