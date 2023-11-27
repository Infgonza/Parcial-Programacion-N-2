package programacionparcial.concesionaria;

import interfazGráfica.AgregarVehiculo;
import interfazGráfica.Pantalla1;

public class Principal {


    public static void main(String[] args) {
        
        //Creamos un objeto tipo Concesionaria
        Concesionaria c= new Concesionaria ("Racing");
        
        //Llamamos y hacemso visible a la interfaz grafica
        Pantalla1 pantallaPrincipal= new Pantalla1();
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
        
        AgregarVehiculo pantallaAgregarVehiculo = new AgregarVehiculo(c, pantallaPrincipal);
        
        // Vemos la lista de vehiculos.
        c.listVehiculos();
        // Agregamos un auto.
        c.agregarVehiculo("Toyota", "Corolla", "Blanco", "ABC123", 20000, "2020", "auto", 4, 0, 0);
        // Agregamos una moto.
        c.agregarVehiculo("Honda", "Titan", "Roja", "DEF456", 5000, "2019", "moto", 0, 125, 0); 
        // Agregamos una camioneta.
        c.agregarVehiculo("Ford", "Ranger", "Negra", "GHI789", 30000, "2018", "camioneta", 0, 0, 1000);
        // Intentamos agregar un vehiculo con la misma patente.
        c.agregarVehiculo("Toyota", "Hilux", "Blanca", "GHI789", 35000, "2020", "camioneta", 0, 0, 1000);
        
        // Vemos la lista de vehiculos pero ahora con vehiculos cargados.
        c.listVehiculos();
        
        // Eliminamos un vehiculo.
        c.eliminarVehiculo("DEF456");
        // Intentamos eliminar un vehiculo que no existe.
        c.eliminarVehiculo("ASQ123");
        // Vemos de nuevo la lista de vehiculos pero ahora con un vehiculo eliminado.
        c.listVehiculos();
        
        
    }
    
}
