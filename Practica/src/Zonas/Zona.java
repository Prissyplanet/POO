package Zonas;

public class Zona {
    private String nombre;
    private double superficie;
    public Zona(String nombre, double superficie){
        this.nombre=nombre;
        this.superficie=superficie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getSuperficie() {
        return superficie;
    }
}
