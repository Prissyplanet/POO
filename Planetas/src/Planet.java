public class Planet {

    private String name;
    private double sun_distance;
    private String composition;
    private int orbit_days;
    public double mass;


        //Constructor
    public Planet(String nombre, double distancia_sol, String composicion, int dias_orbita, double masa){
        this.name=nombre;
        this.sun_distance=distancia_sol;
        this.composition=composicion;
        this.orbit_days=dias_orbita;
        this.mass=masa;
    }
    public void setName(String nuevoNombre){
        this.name=nuevoNombre;
    }
    public String getName() {
        return this.name;
    }
    public void setSunDistance(double nuevaDistanciaSol){
        this.sun_distance=nuevaDistanciaSol;
    }
    public double getSunDistance(){
        return this.sun_distance;
    }
    public void setComposition(String nuevaComposicion){
        this.composition=nuevaComposicion;
    }
    public String getComposition(){
        return  this.composition;
    }
    public void setOrbitDays(int nuevosDias){
        this.orbit_days=nuevosDias;
    }
    public int getOrbitDays() {
        return this.orbit_days;
    }
}
