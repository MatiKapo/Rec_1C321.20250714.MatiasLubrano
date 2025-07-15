/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1_.recu;

/**
 *
 * @author Matias
 */
public abstract class Vehiculo implements Comparable<Vehiculo>{
    
    private String patente;
    private String marca;
    private int anioFabricacion;

    public Vehiculo(String patente, String marca, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    
    public abstract void Recorrer();
    
    
    @Override
    
    public int compareTo(Vehiculo otroVehiculo){
        return this.marca.compareTo(otroVehiculo.marca);
    }
    
    @Override
    
    public boolean equals(Object o){
        
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        
        return anioFabricacion == vehiculo.anioFabricacion && patente.equals(vehiculo.patente);
    }
    
    
    
    
}
