package programacionparcial.concesionaria;

public class Vehiculo {
        
    private String marca;
    private String modelo;
    private String color;
    private String patente;
    private double precio;
    private String año;

    public Vehiculo(String marca, String modelo, String color, String patente, double precio, String año) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.patente = patente;
        this.precio = precio;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return " marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", patente=" + patente + ", precio=" + precio + ", a\u00f1o=" + año + '}';
    }

    public Object getTipo() {
        return "";
    }

    public Object getCantPuertas() {
        return 0;
    }

    public Object getCilindrada() {
        return 0;
    }

    public Object getPesoMax() {
        return 0.0;
    }
    
    
    
    
    
}
