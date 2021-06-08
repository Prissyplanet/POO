public class Recepcionista extends Usuario {
    private String consultorio;
    private int horasTrabajadas;
    private double sueldoHora;
    public Recepcionista(String nombre, String usuario, String contraseña, String consultorio, int horasTrabajadas, double sueldoHora) {
        super(nombre, usuario, contraseña);
        this.consultorio=consultorio;
        this.horasTrabajadas=horasTrabajadas;
        this.sueldoHora=sueldoHora;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }
}
