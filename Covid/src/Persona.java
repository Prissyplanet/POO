import java.util.Date;

public class Persona {
    private String nombre;
    private String curp;
    private String fecha;
    private Vacuna vacuna;
    private String sexo;

    public Persona(String nombre, String curp, String sexo) {
        this.nombre = nombre;
        this.curp = curp;
        this.sexo=sexo;
        Date fechaDate=new Date();
        this.fecha=fechaDate.getYear()+"/"+fechaDate.getMonth()+"/"+fechaDate.getDay();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Vacuna getVacuna() {
        return vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
}
