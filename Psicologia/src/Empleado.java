public abstract class Empleado extends Persona {
    private double sueldoHora;
    private int horasTrabajadas;
    public Empleado(String nombre, double sueldoHora,int horasTrabajadas) {
        super(nombre);
        this.sueldoHora=sueldoHora;
        this.horasTrabajadas=horasTrabajadas;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public abstract double calcularSueldo();


}
