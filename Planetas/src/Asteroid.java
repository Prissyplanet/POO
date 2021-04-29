public class Asteroid {
    private String name;
    private String composition;
    public int distance_of_earth;
    protected double speed;

    //Constructor
    public Asteroid(String nombre, String composicion, int distancia_tierra, double velocidad){
        this.name=nombre;
        this.composition=composicion;
        this.distance_of_earth=distancia_tierra;
        this.speed=velocidad;
    }

    public void setName(String nuevoNombre){
        this.name=nuevoNombre;
    }
    public String getName() {
        return this.name;
    }
    public void setComposition(String nuevaComposicion){
        this.composition=nuevaComposicion;
    }
    public String getComposition(){
        return  this.composition;
    }
    public void setDistance_of_earth(int distance_of_earth) {this.distance_of_earth = distance_of_earth; }
    public int getDistance_of_earth() { return distance_of_earth; }
    public void setSpeed(double nuevaVelocidad){
        this.speed=nuevaVelocidad;
    }
    public double getSpeed() {
        return this.speed;
    }
}
