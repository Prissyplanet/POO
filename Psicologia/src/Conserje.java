public class Conserje extends Empleado {
    private int inventarioTrapeadores;
    private int invetarioEscobas;
    public Conserje(String nombre, double sueldoHora, int horasTrabajadas,int inventarioTrapeadores, int invetarioEscobas){
        super(nombre,sueldoHora,horasTrabajadas);
        this.inventarioTrapeadores=inventarioTrapeadores;
        this.invetarioEscobas=invetarioEscobas;
    }

    public void setInventarioTrapeadores(int inventarioTrapeadores) {
        this.inventarioTrapeadores = inventarioTrapeadores;
    }

    public int getInventarioTrapeadores() {
        return inventarioTrapeadores;
    }

    public void setInvetarioEscobas(int invetarioEscobas) {
        this.invetarioEscobas = invetarioEscobas;
    }

    public int getInvetarioEscobas() {
        return invetarioEscobas;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
}
