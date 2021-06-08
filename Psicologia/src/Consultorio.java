
public abstract class Consultorio {
    private String nombre;

    public Consultorio(String nombre) {
        this.nombre=nombre;

    }
    public abstract String verCalendariodeCitas();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


}
