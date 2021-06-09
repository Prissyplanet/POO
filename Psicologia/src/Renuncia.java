import java.util.Scanner;
public class Renuncia implements NuevaRenuncia{
    public Recepcionista[] recepcionistaRenuncia;
     int motivo;
     private String fecha;
    Recepcionista datosRecepcionista;
    int cantidadRenuncias;
    Scanner scanner=new Scanner(System.in);
    public Renuncia(String fecha){
        this.fecha=fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public void setRecepcionista() {
        System.out.println("Por favor, confirme el dato ¿Cuántas renuncias desea presentar?\n" +
                "[1]Una, solo para mí\n" +
                "[Escriba la cantidad] Yo y mi/s compañero/s");
        cantidadRenuncias=scanner.nextInt();
        recepcionistaRenuncia=new Recepcionista[cantidadRenuncias];
        for (int x = 0; x < cantidadRenuncias; x++) {
            System.out.println("Escriba el nombre del recepcionista "+(x+1)+":");
            String nombre=scanner.next();
            System.out.println("Escriba el consultorio para el que trabajaba el recepcionista "+(x+1)+":");
            String consultorio=scanner.next();
            System.out.println("Escriba las horas trabajadas esta semana por el recepcionista "+(x+1)+":");
            int horasTrabajadas=scanner.nextInt();
            System.out.println("¿Qué sueldo por hora tenía el recepcionista: "+(x+1)+"?");
            double sueldo=scanner.nextDouble();
            System.out.println("¿Trabajó horas extras? ¿Cuántas?");
            int extras=scanner.nextInt();
            datosRecepcionista=new Recepcionista(nombre,consultorio,horasTrabajadas,sueldo,extras);
            recepcionistaRenuncia[x]=datosRecepcionista;
            System.out.println("¿Cuál es el motivo de su renuncia?\n" +
                    "[1]Poca paga\n" +
                    "[2]Maltrato\n" +
                    "[3]Motivos personales\n" +
                    "[4]Otro");
            motivo=scanner.nextInt();
        }//for
        if (recepcionistaRenuncia.length != 0) {
            for (int x = 0; x < recepcionistaRenuncia.length; x++) {
                System.out.println("El señor/a " + recepcionistaRenuncia[x].getNombre()+", quien trabajaba como recepcionista en el consultorio "+recepcionistaRenuncia[x].getConsultorio()+" con un sueldo de: "+recepcionistaRenuncia[x].getSueldoHora()+". Presenta su renuncia oficialmente, con el siguiente motivo: \n");
                if(motivo==1){
                    System.out.println("Poca paga");
                }else if(motivo==2){
                    System.out.println("Maltrato");
                }else if(motivo==3){
                    System.out.println("Razones personales");
                }else if(motivo==4){
                    System.out.println("No especificado");
                }
                System.out.println("A día "+this.fecha);
            }//for
        } else {
            System.out.println("Tenga un buen día");
        }


    }
}
