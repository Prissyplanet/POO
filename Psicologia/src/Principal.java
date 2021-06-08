import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Benvenido, usuario");
        int usuario=0;
        Psicologo[] psicologos=new Psicologo[0];
        Paciente[] pacientes=new Paciente[0];
        Recepcionista[] recepcionistas=new Recepcionista[0];
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Qué tipo de usuario eres?\n" +
                "[1]Psicólogo\n" +
                "[2]Recepcionista\n" +
                "[3]Paciente");
        usuario=scanner.nextInt();
        if(usuario==1){
            int opcion=0;
            while(opcion!=4){
            System.out.println("¿Qué desea hacer, doctor?\n" +
                    "[1]Registrar una cuenta\n" +
                    "[2]Ver mi calendario de citas\n" +
                    "[3]Consultar cuentas registradas de psicólogos\n" +
                    "[4]Salir");
            opcion=scanner.nextInt();
                Psicologo datosPsicologo=new Psicologo("a","a");
            switch (opcion){
                case 1:{
                    System.out.println("¿Cuántas cuentas desea crear?");
                    int cantidadCuentas=scanner.nextInt();
                    psicologos=new Psicologo[cantidadCuentas];
                    for(int x=0;x<cantidadCuentas;x++){
                        System.out.println("Por favor, inserte el nombre de la cuenta "+(x+1));
                        String nombre=scanner.next();
                        System.out.println("Por favor, inserte el apellido de la cuenta "+(x+1));
                        String apellido=scanner.next();
                       datosPsicologo=new Psicologo(nombre,apellido);
                        psicologos[x]=datosPsicologo;

                    }//for cantidadCuentas
                }break;
                case 2:{
                    for(int x=0;x<psicologos.length;x++) {
                        System.out.println(psicologos[x].verCalendariodeCitas()+"doctor "+psicologos[x].getApellido());
                    }//for calendario de psicologos
                }break;
                case 3:{
                    System.out.println("Estas son las cuentas de psicólogos que han sido registradas: ");
                    if(psicologos.length!=0){
                        for(int x=0; x<psicologos.length; x++){
                            System.out.println("Doctor "+ (x+1)+": "+psicologos[x].getNombre()+" "+ psicologos[x].getApellido());
                        }//for
                    }else{
                        System.out.println("No se han insertado datos de psicólogos aún");
                    }
                }break;
                case 4:{
                    System.out.println("Hasta luego, doctor");
                }
            }//switch






            }//while

        }else if(usuario==2){

        }//else if usuario


    }//psvm
}//class
