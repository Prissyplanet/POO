public class Psicologo extends Consultorio {

        private String apellido;
    public Psicologo(String nombre, String apellido) {
        super(nombre);
        this.apellido=apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String verCalendariodeCitas() {
        return "Este es el calendario, ";
    }
}
