package programacionparcial.concesionaria;

public class Moto extends Vehiculo {
    
    private int cilindrada;

    public Moto(int cilindrada, String marca, String modelo, String color, String patente, double precio, String año) {
        super(marca, modelo, color, patente, precio, año);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindrada=" + cilindrada + ", " + super.toString() +'}';
    }
    
    @Override
    public String getTipo() {
        return "Moto";
    }
    
}
