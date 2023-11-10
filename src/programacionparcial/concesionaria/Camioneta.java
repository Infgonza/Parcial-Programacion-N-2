package programacionparcial.concesionaria;

public class Camioneta extends Vehiculo{
    
    private double pesoMax;

    public Camioneta(double pesoMax, String marca, String modelo, String color, String patente, double precio, String año) {
        super(marca, modelo, color, patente, precio, año);
        this.pesoMax = pesoMax;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "pesoMax=" + pesoMax + ", " + super.toString() +'}';
    }
    
    
    
}
