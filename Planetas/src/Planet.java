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


}
