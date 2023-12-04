
package programacionparcial.concesionaria;

import java.util.List;

public class Controladora {

    private Concesionaria c = new Concesionaria("Racing");

    public void agregarVehiculo(String marca, String modelo, String color, String patente,
            double precio, String año, String tipo, int cantPuertas, int cilindrada, double pesoMax) {

        c.agregarVehiculo(marca, modelo, color, patente, precio, año, tipo, cantPuertas, cilindrada, pesoMax);
        
    }

    public List<Vehiculo> traerVehiculos() {
        // Utiliza la misma instancia de Concesionaria para obtener la lista
        return Concesionaria.obtenerInventario();
    }
}