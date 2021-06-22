public class Vacuna {
    private String nombre;
    private String marcaVacuna;
    private int numeroDosis;

    public Vacuna(String nombre, String marcaVacuna, int numeroDosis) {
        this.nombre = nombre;
        this.marcaVacuna = marcaVacuna;
        this.numeroDosis = numeroDosis;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMarcaVacuna(String marcaVacuna) {
        this.marcaVacuna = marcaVacuna;
    }

    public String getMarcaVacuna() {
        return marcaVacuna;
    }

    public void setNumeroDosis(int numeroDosis) {
        this.numeroDosis = numeroDosis;
    }

    public int getNumeroDosis() {
        return numeroDosis;
    }
}
