/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1_.recu;

import java.util.Scanner;
import static parcial1_.recu.Sistema.agregarVehiculo;
import static parcial1_.recu.Sistema.iniciarRecorrido;
import static parcial1_.recu.Sistema.mostrarVehiculos;
import static parcial1_.recu.Sistema.ordenarPorAnio;
import static parcial1_.recu.Sistema.ordenarPorMarca;

/**
 *
 * @author Matias
 */
public class Parcial1_Recu {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("--- Sistema de Gestion de Transporte Terrestre ---");
            System.out.println();
            System.out.println("1. Agregar Vehiculo");
            System.out.println("2. Mostrar Vehiculos");
            System.out.println("3. Iniciar Recorrido");
            System.out.println("4. Ordenar por marca");
            System.out.println("5. Ordenar por anio de fabricacion (DESCENDENTE)");
            System.out.println("6. Salir");
            System.out.println();
            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:   
                    agregarVehiculo();
                    break;  
                case 2:
                    mostrarVehiculos(); 
                    break;
                case 3:
                    iniciarRecorrido();
                    break;
                case 4:
                    ordenarPorMarca();
                    break;
                case 5:
                    ordenarPorAnio();
                    break;             
                                                    
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println();
                    System.out.println("--- OPCION INVALIDA ---");
                    System.out.println();

            }
            
        }while (opcion != 6);
    }
    
    
        
    
}
