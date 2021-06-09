public class Psicologo extends Empleado {

        private String apellido;
    public Psicologo(String nombre, String apellido,double sueldoHora, int horasTrabajadas) {
        super(nombre,sueldoHora,horasTrabajadas);
        this.apellido=apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }



    @Override
    public double calcularSueldo() {
        return this.getSueldoHora()*this.getHorasTrabajadas();
    }
}
