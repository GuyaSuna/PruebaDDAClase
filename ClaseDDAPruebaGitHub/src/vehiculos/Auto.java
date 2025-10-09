package vehiculos;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;
    private String color;

    public Auto(String marca, String modelo, int anio, double precio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " (" + anio + ") - " + color + " - $" + precio);
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + anio + ") - " + color + " - $" + precio;
    }
}
