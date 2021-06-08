public class Paciente extends Consultorio {
    private int edad;
    private String diagnostico;
    private int numeroCitas;
    public Paciente(String nombre,int edad, String diagnostico,int numeroCitas) {
        super(nombre);
        this.edad=edad;
        this.diagnostico=diagnostico;
        this.numeroCitas=numeroCitas;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setNumeroCitas(int numeroCitas) {
        this.numeroCitas = numeroCitas;
    }

    public int getNumeroCitas() {
        return numeroCitas;
    }

    @Override
    public String verCalendariodeCitas() {
        return null;
    }
}
