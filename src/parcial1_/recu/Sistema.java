/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1_.recu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Matias
 */
public class Sistema {
    
    static List<Vehiculo> vehiculos = new ArrayList<>();
    
    public static void agregarVehiculo(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        
        System.out.println("--- INGRESE DATOS DEL VEHICULO ---");
        System.out.println();
        
        System.out.println("Ingrese la patente del Vehiculo: ");
        String patente = sc.nextLine();
        
        System.out.println("Ingrese el Anio del Vehiculo: ");
        int anio = sc.nextInt();
        
        if(chequearExistencia(patente, anio)){
            
            System.out.println();
            System.out.println("--- INVALIDO, ESTE VEHICULO YA EXISTE ---");
            System.out.println();
            return;
        }
        
        sc.nextLine();
        System.out.println("Ingrese la marca del Vehiculo: ");
        String marca = sc.nextLine();
        
        System.out.println("Ingrese el tipo de Vehiculo ( 1 - Camion de carga ) - ( 2 - Colectivo de Pasajeros) - ( 3 - Inspeccion): ");
        int tipo = sc.nextInt();
        
        switch(tipo){
            
            case 1:
                
                System.out.println("Ingrese la Capacidad de Carga (ENTRE 1 Y 30): ");
                int carga = sc.nextInt();
                
                if (carga <= 1){
                    carga = 1;
                    
                }else if(carga >= 30){
                    carga = 30;
                                                    
                }else{
                    carga = carga;
                }
                
                Vehiculo camionCarga = new CamionCarga(patente, marca, anio, carga);
                vehiculos.add(camionCarga);
                
                System.out.println();
                System.out.println("Camion de carga agregado correctamente");
                System.out.println();
                break;
                
            case 2:
                
                System.out.println("Ingrese la Cantidad de Pasajeros: ");
                int capacidad = sc.nextInt();
                
                Vehiculo colectivoPasajeros = new ColectivoPasajeros(patente, marca, anio, capacidad);
                vehiculos.add(colectivoPasajeros);
                
                System.out.println();
                System.out.println("Colectivo de pasajeros agregado correctamente");
                System.out.println();
                break;
            
            case 3:
                
                System.out.println("Ingrese Tipo de Uso: MANTENIMIENTO / SUPERVISION / EMERGENCIA");
                String tipoUso = sc.next();
                tipoUso = tipoUso.toLowerCase();
                if(tipoUso.equals("mantenimiento") || tipoUso.equals("supervision") || tipoUso.equals("emergencia")){
                    Vehiculo inspeccion = new Inspeccion(patente, marca, anio, tipoUso);
                    vehiculos.add(inspeccion);
                }else{
                    System.out.println("Tipo de Uso Invalido");
                    return;
                }
                
                
                System.out.println();
                System.out.println("Vehiculo de inspeccion agregado correctamente");
                System.out.println();
                break;
                
            default:
                
                System.out.println("Tipo de vehiculo Invalido");
                
                
            
        }
        
    }
    
    public static boolean chequearExistencia(String patente, int anio){
        
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getPatente().equals(patente)&& vehiculo.getAnioFabricacion() == anio){
               return true;
            
            }
        }return false;
    }
    
    public static void mostrarVehiculos(){
        
        System.out.println();
        System.out.println("--- LISTADO DE VEHICULOS ---");
        System.out.println();
        
        for(Vehiculo vehiculo: vehiculos){
            System.out.println(vehiculo);
        }
        
        System.out.println();
    }
    
    public static void ordenarPorMarca(){
        
        Collections.sort(vehiculos);
        mostrarVehiculos();
    }
    
    public static class compararAnio implements Comparator<Vehiculo>{
        
        @Override
        
        public int compare(Vehiculo v1, Vehiculo v2){
            return Integer.compare(v2.getAnioFabricacion(),v1.getAnioFabricacion());
        }
    }
    
    public static void ordenarPorAnio(){
        vehiculos.sort(new compararAnio());
        mostrarVehiculos();
        
    }
    
    public static void iniciarRecorrido(){
        
        System.out.println();
        System.out.println("--- INICIANDO RECORRIDO DE VEHICULOS ---");
        System.out.println();
        for(Vehiculo vehiculo : vehiculos){
            vehiculo.Recorrer();
        }
        System.out.println();
    }   
    
    
}
