public class Asteroid {
    private String name;
    private String composition;
    public String distance_of_earth;
    protected double speed;

    //Constructor
    public Asteroid(String nombre, String composicion, int distancia_tierra, double velocidad) {
        this.name = nombre;
        this.composition = composicion;
        this.distance_of_earth = composicion;
        this.speed = velocidad;
    }
}
