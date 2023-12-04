package programacionparcial.concesionaria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Concesionaria {
    
    private String nombre;
    private static List<Vehiculo> inventario = new ArrayList<>();
    
    public static List<Vehiculo> obtenerInventario() {
        return inventario;
    }
    
    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>();
    }
    
    public void listVehiculos(){
            if (inventario.isEmpty()){
                System.out.println("No hay vehiculos");
                System.out.println("-------------------------------------------------");
            } else{
                for (Vehiculo vehiculo : inventario) {
                    System.out.println(vehiculo);
                    System.out.println("-------------------------------------------------");
            }
        }
    }
    
    // Agrega un vehiculo al inventario segun tipo
    public void agregarVehiculo(String marca, String modelo, String color, String patente, double precio, String año, String tipo, int cantPuertas, int cilindrada, double pesoMax) {
        
        //Comprueba si existe un vehiculo con esa patente
        if (!existeVehiculo(patente)) {
            switch (tipo.toLowerCase()) {
                case "auto":
                     inventario.add(new Auto(cantPuertas, marca, modelo, color, patente, precio, año));
                     System.out.println("Auto agregado.");
                     System.out.println("-------------------------------------------------");
                     break;
                case "moto":
                     inventario.add(new Moto(cilindrada,marca, modelo, color, patente, (int) precio, año));
                     System.out.println("Moto agregada.");
                     System.out.println("-------------------------------------------------");
                     break;
                case "camioneta":
                     inventario.add(new Camioneta(pesoMax, marca, modelo, color, patente, (int) precio, año));
                     System.out.println("Camioneta agregada.");
                     System.out.println("-------------------------------------------------");
                     break;
            default:
                System.out.println("Tipo de vehículo desconocido");
                System.out.println("-------------------------------------------------");
            }
            
        } else{
        System.out.println("Ya existe un vehículo con la patente: " + patente + ". No se pudo agregar.");
        System.out.println("-------------------------------------------------");
        }
    }

    private boolean existeVehiculo(String patente) {
        for (Vehiculo v : inventario) {
            if (v.getPatente().equals(patente)) {
                return true;
            }   
        }
        return false;
    }
    
    // Elimina un vehiculo segun la patente
    public void eliminarVehiculo(String patente) {
        Iterator<Vehiculo> iter = inventario.iterator();
        while (iter.hasNext()) {
            Vehiculo vehiculo = iter.next();
            if (vehiculo.getPatente().equals(patente)) {
                iter.remove();
                System.out.println("Vehículo con patente " + patente + " eliminado.");
                System.out.println("-------------------------------------------------");
                return; 
            }
        }
        System.out.println("Vehículo con patente " + patente + " no encontrado en el inventario.");
        System.out.println("-------------------------------------------------");
    }
    
    
    
}
