package HOTELES;

public class Hotel {
    private String nombre;
    public int ocupadas;
    public int disponibles;
    public  Hotel(String nombre, int ocupadas, int disponibles){
        this.nombre=nombre;
        this.ocupadas=ocupadas;
        this.disponibles=disponibles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setOcupadas(int ocupadas) {
        this.ocupadas = ocupadas;
    }

    public int getOcupadas() {
        return ocupadas;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public int getDisponibles() {
        return disponibles;
    }
    public int imprimirCapacidadHotel(){
        return (this.disponibles+this.ocupadas);
    }
}

