import java.util.Scanner;
public class Paciente extends Persona {
    public int edad;
    public String diagnostico;
    public String fecha;

    public Paciente(String nombre, int edad, String diagnostico, String fecha) {
        super(nombre);
        this.edad = edad;
        this.diagnostico = diagnostico;
        this.fecha = fecha;
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

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public void hablar() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Deseas poner una queja?\n" +
                "[1]Si\n" +
                "[2]No");
        int opcion=scanner.nextInt();
        if(opcion==1){
            System.out.println("¿Cuál es su queja? (UTILICE '_' EN LUGAR DE ESPACIOS, POR FAVOR");
            String queja=scanner.next();
            System.out.println("Tu queja: "+queja+". Ha sido registrada con éxito y se la haremos llegar a autoridades en el consultorio ");
        }else if(opcion==2){
            System.out.println("Tenga un buen día");

        }//else

    }//hablar
}//class



