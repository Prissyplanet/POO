import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido, usuario");
        int usuario;
        Psicologo[] psicologos = new Psicologo[0];
        Paciente[] pacientes = new Paciente[0];
        Cita[] citasPsicologos = new Cita[0];
        Cita[] citasPacientes = new Cita[0];
        Recepcionista[] recepcionistas = new Recepcionista[0];
        Scanner scanner = new Scanner(System.in);
        Psicologo datosPsicologo;
        Recepcionista datosRecepcionista;
        Paciente datosPaciente;
        Cita datosCitaPsicologos;
        Cita datosCitaPacientes;
        Renuncia[] renuncia=new Renuncia[0];
        Renuncia datosRenuncia;
        Empleado conserje1=new Conserje("Pepe",200,7,3,3);
        Empleado conserje2=new Conserje("Laura",200,7,3,3);
        System.out.println("¿Qué tipo de usuario eres?\n" +
                "[1]Psicólogo/a\n" +
                "[2]Recepcionista\n" +
                "[3]Paciente\n" +
                "[4]Quiero consultar el personal de limpieza");
        usuario = scanner.nextInt();
        if (usuario == 1) {
            int opcion = 0;
            while (opcion != 4) {
                System.out.println("¿Qué desea hacer, doctor/a?\n" +
                        "[1]Registrar una cuenta\n" +
                        "[2]Consultar mi sueldo\n" +
                        "[3]Consultar cuentas registradas de psicólogos/as\n" +
                        "[4]Salir");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1: {
                        System.out.println("¿Cuántas cuentas desea crear?");
                        int cantidadCuentas = scanner.nextInt();
                        psicologos = new Psicologo[cantidadCuentas];
                        for (int x = 0; x < cantidadCuentas; x++) {
                            System.out.println("Por favor, inserte el nombre de la cuenta " + (x + 1));
                            String nombre = scanner.next();
                            System.out.println("Por favor, inserte el apellido de la cuenta " + (x + 1));
                            String apellido = scanner.next();
                            System.out.println("Por favor, inserte el costo por hora en el consultorio de la cuenta " + (x + 1));
                            double sueldoHora = scanner.nextDouble();
                            System.out.println("¿Cuántas horas ha trabajado la cuenta " + (x + 1) + "?");
                            int horasTrabajadas = scanner.nextInt();
                            datosPsicologo = new Psicologo(nombre, apellido, sueldoHora, horasTrabajadas);
                            psicologos[x] = datosPsicologo;

                        }//for cantidadCuentas
                    }//case 1 psicologos
                    break;
                    case 2: {
                        for (int x = 0; x < psicologos.length; x++) {
                            System.out.println("Este será su sueldo, doctor " + psicologos[x].getApellido()+": $"+psicologos[x].calcularSueldo());
                        }//for calendario de psicologos
                    }//case 2 psicologos
                    break;
                    case 3: {
                        System.out.println("Estas son las cuentas de psicólogos/as que han sido registradas: ");
                        if (psicologos.length != 0) {
                            for (int x = 0; x < psicologos.length; x++) {
                                System.out.println("Doctor " + (x + 1) + ": " + psicologos[x].getNombre() + " " + psicologos[x].getApellido());
                            }//for
                        } else {
                            System.out.println("No se han insertado datos de psicólogos/as aún");
                        }//else
                    }//case 3 psicologos
                    break;
                    case 4: {
                        System.out.println("Hasta luego, doctor/a");
                    }//case 4 psicólogos
                }//switch psicologos
            }//while psicologos

        } else if (usuario == 2) {
            int opcion = 0;
            while (opcion != 8) {
                System.out.println("¿Qué desea hacer, usuario?\n" +
                        "[1]Registrar una cuenta de recepcionista\n" +
                        "[2]calcular mi sueldo\n" +
                        "[3]Consultar cuentas registradas de recepcionistas\n" +
                        "[4]Registrar una cita\n" +
                        "[5]Consultar citas de psicólogos/as\n" +
                        "[6]Consultar citas de pacientes/as\n" +
                        "[7]Presentar mi renuncia\n" +
                        "[8]Salir");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1: {
                        System.out.println("¿Cuántas cuentas desea crear?");
                        int cantidadCuentas = scanner.nextInt();
                        recepcionistas = new Recepcionista[cantidadCuentas];
                        for (int x = 0; x < cantidadCuentas; x++) {
                            System.out.println("Por favor, inserte el nombre de la cuenta " + (x + 1));
                            String nombre = scanner.next();
                            System.out.println("Por favor, inserte el consultorio de la cuenta " + (x + 1));
                            String consultorio = scanner.next();
                            System.out.println("Por favor, inserte las horas trabajadas de la cuenta " + (x + 1));
                            int horas = scanner.nextInt();
                            System.out.println("Por favor, inserte  el sueldo por hora de la cuenta " + (x + 1));
                            double sueldo = scanner.nextDouble();
                            System.out.println("Por favor, inserte las horas extra trabajadas por la cuenta " + (x + 1));
                            int horasExtra = scanner.nextInt();
                            datosRecepcionista = new Recepcionista(nombre, consultorio, horas, sueldo, horasExtra);
                            recepcionistas[x] = datosRecepcionista;

                        }//for cantidadCuentas
                    }//case 1 recepcionistas
                    break;
                    case 2: {
                        if (recepcionistas.length != 0) {
                            for (int x = 0; x < recepcionistas.length; x++) {
                                if (recepcionistas[x].getHorasTrabajadas() != 0) {
                                    System.out.println("Este es el sueldo de la cuenta " + (x + 1) + ": $" + recepcionistas[x].calcularSueldo());
                                } else {
                                    System.out.println("No hay horas de trabajo registradas esta semana");
                                }//else
                            }//for sueldo de recepcionista
                        } else {
                            System.out.println("No hay horas de trabajo registradas esta semana");
                        }//else
                    }//Case 2 recepcionistas
                    break;
                    case 3: {
                        System.out.println("Estas son las cuentas de recepcionistas que han sido registradas: ");
                        if (recepcionistas.length != 0) {
                            for (int x = 0; x < recepcionistas.length; x++) {
                                System.out.println("Recepcionista " + (x + 1) + ": " + recepcionistas[x].getNombre() + ", trabajando en el consultorio: " + recepcionistas[x].getConsultorio() + ". Ha trabajado " + recepcionistas[x].getHorasTrabajadas() + " hora(s), más "+recepcionistas[x].getHorasextra()+ " hora(s) extra, con un sueldo de:  $" + recepcionistas[x].getSueldoHora() + " por hora en horario normal y el doble para horas extra");
                            }//for
                        } else {
                            System.out.println("No se han insertado datos de recepcionistas aún");
                        }//else
                    }//case 3 recepcionistas
                    break;
                    case 4: {
                        int opcionCita;
                        System.out.println("¿A quien deseas hacerle una cita?\n" +
                                "[1]Psicólogo/a\n" +
                                "[2]Pacientes\n" +
                                "[3]Cancelar");
                        opcionCita = scanner.nextInt();
                        if (opcionCita == 1) {
                            System.out.println("¿Cuántas citas desea crear?");
                            int cantidadCitasPsicologos = scanner.nextInt();
                            citasPsicologos = new Cita[cantidadCitasPsicologos];
                            for (int x = 0; x < cantidadCitasPsicologos; x++) {
                                System.out.println("Por favor, inserte la fecha de hoy: ");
                                String fecha = scanner.next();
                                datosCitaPsicologos = new Cita(fecha);
                                citasPsicologos[x] = datosCitaPsicologos;
                                citasPsicologos[x].setPsicologo();

                            }//for cantidad de citas psicologos

                        } else if (opcionCita == 2) {
                            System.out.println("¿Cuántas citas desea crear?");
                            int cantidadCitas = scanner.nextInt();
                            citasPacientes = new Cita[cantidadCitas];
                            for (int x = 0; x < cantidadCitas; x++) {
                                System.out.println("Por favor, inserte la fecha de hoy: ");
                                String fecha = scanner.next();
                                datosCitaPacientes = new Cita(fecha);
                                citasPacientes[x] = datosCitaPacientes;
                                citasPacientes[x].setPaciente();

                            }//for cantidad de citas clientes

                        }//else if

                    }//case 4 recepcionistas
                    break;
                    case 5: {
                        System.out.println("Estas son las citas que han sido registradas para psicólogos/as ");
                        if (citasPsicologos.length != 0) {
                            for (int x = 0; x < citasPsicologos.length; x++) {
                                System.out.println("Cita " + (x + 1) + ": \n" +
                                        "Fecha de impresión: " + citasPsicologos[x].getFechaCita() + "\n");
                                citasPsicologos[x].imprimirCitaPsicologo();
                            }//for
                        } else {
                            System.out.println("No han sido agendadas citas para ningún psicólogo/a");
                        }//else
                    }//case 5 recepcionistas
                    break;
                    case 6: {
                        System.out.println("Estas son las citas que han sido registradas para pacientes ");
                        if (citasPacientes.length != 0) {
                            for (int x = 0; x < citasPacientes.length; x++) {
                                System.out.println("Cita " + (x + 1) + ": \n" +
                                        "Fecha de impresión: " + citasPacientes[x].getFechaCita() + "\n");
                                citasPacientes[x].imprimirCitaPaciente();
                            }//for
                        } else {
                            System.out.println("Ningún paciente ha agendado una cita");
                        }//else
                    }//case 6 recepcionistas
                    break;
                    case 7: {
                        System.out.println("¿Cuántas renuncias desea presentar?");
                        int cantidadRenuncias = scanner.nextInt();
                        renuncia = new Renuncia[cantidadRenuncias];
                        System.out.println("Por favor, inserte la fecha de hoy: ");
                        String fecha = scanner.next();
                        for (int x = 0; x < cantidadRenuncias; x++) {
                            datosRenuncia = new Renuncia(fecha);
                            renuncia[x] = datosRenuncia;
                            renuncia[x].setRecepcionista();
                        }//for
                    }//case 7 recepcionistas
                    break;
                    case 8:{
                        System.out.println("Hasta luego, usuario");
                    }break;
                }//switch recepcionistas
            }//while recepcionistas
        } else if (usuario == 3) {
            int opcion = 0;
            while (opcion != 3) {
                System.out.println("¿Qué desea hacer?\n" +
                        "[1]Realizar un registro\n" +
                        "[2]Realizar una queja (Hay que realizar un registro primero, puede ser anónimo)\n" +
                        "[3]Salir");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1: {
                        System.out.println("¿Cuántas cuentas desea realizar?");
                        int cantidadCuentas = scanner.nextInt();
                        pacientes = new Paciente[cantidadCuentas];
                        for (int x = 0; x < cantidadCuentas; x++) {
                            System.out.println("Por favor, inserte el nombre de la cuenta " + (x + 1) + " (SI DESEA REALIZAR UNA QUEJA ANÓNIMA, POR FAVOR INSERTE: 'ANONIMO' CON MAYÚSCULAS");
                            String nombre = scanner.next();
                            System.out.println("Por favor, inserte la edad del propietario de la cuenta " + (x + 1));
                            int edad = scanner.nextInt();
                            System.out.println("Por favor, inserte el diagnóstico del propietario de la cuenta " + (x + 1) + " (SI NO HA SIDO DIAGNÓSTICADO, POR FAVOR INSERTE: 'NO' EN MAYÚSCULAS");
                            String diagnostico = scanner.next();
                            System.out.println("Por favor, inserte la fecha a la que desea su consulta (SI NO DESEA UNA CONSULTA, POR FAVOR INSERTE: 'NO' EN MAYÚSCULAS");
                            String fecha = scanner.next();
                            datosPaciente = new Paciente(nombre, edad, diagnostico, fecha);
                            pacientes[x] = datosPaciente;

                        }//for
                    }//case 1 pacientes
                    break;
                    case 2: {
                        if (pacientes.length != 0) {
                            for (int x = 0; x < pacientes.length; x++) {
                                System.out.println("Buzón de quejas:\n");
                                pacientes[x].hablar();
                                System.out.println("La queja fue realizada por "+pacientes[x].getNombre());
                            }//for
                        }//if


                    }//case 2 pacientes
                    break;
                    case 3:{
                        System.out.println("Tenga un buen día");
                    }//case 3
                    break;

                }//switch
            }//while


        }else if (usuario==4){
            System.out.println("Este es el personal de limpieza: \n");
            System.out.println("Conserje: "+conserje1.getNombre()+"\n" +
                    "Conserje: "+conserje2.getNombre());
        }//else if usuario 4
    }//psvm
}//Principal

