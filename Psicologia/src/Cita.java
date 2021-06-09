import java.util.Scanner;

public class Cita implements NuevaCita{
    public Paciente[] pacienteCita;
    public Psicologo[] psicologoCita;
    private double total;
    private String fechaCita;
    int cantidadPacientes;

    Scanner scanner=new Scanner(System.in);
    public Cita(String fechaCita){
        this.fechaCita=fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    Paciente datosPaciente;
    Psicologo datosPsicologo;
    @Override
    public void setPaciente() {
        System.out.println("¿Para cuántos pacientes será la cita?");
        cantidadPacientes=scanner.nextInt();
        pacienteCita=new Paciente[cantidadPacientes];
        for (int x = 0; x < cantidadPacientes; x++) {
            System.out.println("Escriba el nombre del paciente "+(x+1)+":");
            String nombrePaciente=scanner.next();
            System.out.println("Escriba la edad del paciente "+(x+1)+":");
            int edadPaciente=scanner.nextInt();
            System.out.println("Escriba el diagnóstico del paciente "+(x+1)+":");
            String diagnosticoPaciente=scanner.next();
            System.out.println("¿Qué fecha sería preferente?");
            String fechaPaciente=scanner.next();
            datosPaciente=new Paciente(nombrePaciente,edadPaciente,diagnosticoPaciente,fechaPaciente);
            pacienteCita[x]=datosPaciente;
        }//for
        System.out.println("Cita agendada");
        this.setTotal();
    }//set paciente

    @Override
    public void setTotal() {
        total=700*cantidadPacientes;
        System.out.println("El total a pagar será: "+total+" (EL COSTO PUEDE VARIAR SI ELIGE A UN PSICÓLOGO PARTICULAR)");
    }

    @Override
    public void setPsicologo() {
        System.out.println("¿Cuántos psicólogos serán necearios para la sesión?");
        int cantidadPsicologos=scanner.nextInt();
        psicologoCita=new Psicologo[cantidadPsicologos];
        for (int x = 0; x < cantidadPsicologos; x++) {
            System.out.println("Escriba el nombre del doctor "+(x+1)+":");
            String nombrePsicologo=scanner.next();
            System.out.println("Escriba el apellido del doctor "+(x+1)+":");
            String apellidoPsicologo=scanner.next();
            System.out.println("Escriba el costo de la hora de consulta del doctor "+(x+1)+":");
            double sueldoPsicologo=scanner.nextDouble();
            System.out.println("Escriba cuántas horas de consulta tendrá el doctor "+(x+1)+":");
            int horasPsicologo=scanner.nextInt();
            datosPsicologo=new Psicologo(nombrePsicologo,apellidoPsicologo,sueldoPsicologo,horasPsicologo);
            psicologoCita[x]=datosPsicologo;
            System.out.println("Cita agendada");
        }//for
    }
    public void imprimirCitaPsicologo(){
        if(psicologoCita.length!=0) {
            for (int x = 0; x < psicologoCita.length; x++) {
                System.out.println("Psicólogo: " + psicologoCita[x].getNombre()+"\n" +
                        "Apellido: "+psicologoCita[x].getApellido()+"\n" +
                        "Sueldo a cobrar: "+psicologoCita[x].getSueldoHora());
                System.out.println("La fecha de la cita será determinada por la fecha que elija el paciente, puede consultlarlo en 'Consultar citas de pacientes' ");
            }//for
        }//if
    }//imprimir cita psicólogo
    public void imprimirCitaPaciente(){
        if(pacienteCita.length!=0) {
            for (int x = 0; x < pacienteCita.length; x++) {
                System.out.println("Paciente: " + pacienteCita[x].getNombre()+"\n" +
                        "Edad: "+pacienteCita[x].getEdad()+"\n" +
                        "Diagnóstico: "+pacienteCita[x].getDiagnostico()+"\n" +
                        "Fecha de la cita: "+pacienteCita[x].getFecha());

            }//for
        }//if
    }//imprimir cita psicólogo
}
