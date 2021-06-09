public class Recepcionista extends Empleado {
    private String consultorio;
    private int horasextra;
    private double valorHorasExtra=this.getSueldoHora()*2;
    public Recepcionista(String nombre, String consultorio, int horasTrabajadas, double sueldoHora, int horasextra) {
        super(nombre, sueldoHora,horasTrabajadas);
        this.consultorio=consultorio;
        this.horasextra=horasextra;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public int getHorasextra() {
        return horasextra;
    }

    @Override
    public double calcularSueldo() {
        return (this.getSueldoHora()*this.getHorasTrabajadas())+ (this.getHorasextra()*valorHorasExtra);
    }
}
