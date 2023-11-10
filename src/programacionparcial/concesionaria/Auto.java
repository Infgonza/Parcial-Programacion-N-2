
package programacionparcial.concesionaria;

public class Auto extends Vehiculo{
    
    private int cantPuertas;
    
    public Auto(int cantPuertas, String marca, String modelo, String color, String patente, double precio, String año) {
        super(marca, modelo, color, patente, precio, año);
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" + "cantPuertas=" + cantPuertas + ", " + super.toString() +'}';
    }
    
    
}
