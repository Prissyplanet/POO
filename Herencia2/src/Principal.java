import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido usuario:D");
        int opcion=0;
        Scanner scanner=new Scanner((System.in));
        Dispositivo[] dispositivo=new Dispositivo[0];
        Celular[] celular=new Celular[0];
        PC[] pc=new PC[0];
        Servidor[] servidor=new Servidor[0];
        while(opcion!=6){
            System.out.println("¿Qué desas hacer? [1]Crear celular, [2]Crear PC, [3]Crear servidor, [4]Funciones especiales,[5]Ver dispositivos registrados, [6]Salir");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:{
                    //Crear celular
                    System.out.println("Cuantos dispositivos deseas crear?");
                    int cc=scanner.nextInt();
                    celular=new Celular[cc];
                    for(int x=0; x<cc; x++){
                        System.out.println("¿Cuál es el nombre del dispositivo?");
                        String nombre=scanner.next();
                        System.out.println("¿Cuánta memoria RAM tiene?");
                        double RAM=scanner.nextDouble();
                        System.out.println("¿Cuál es el procesador del dispositivo?");
                        String procesador=scanner.next();
                        System.out.println("¿Cuál es el saldo del dispositivo?");
                        int saldo=scanner.nextInt();
                        Celular datosCelular= new Celular(nombre,RAM,procesador,saldo);
                        celular[x]=datosCelular;
                    }
                }break;
                case 2: {
                    //Crear PC
                    System.out.println("Cuantos dispositivos deseas crear?");
                    int cpc = scanner.nextInt();
                    pc = new PC[cpc];
                    for (int x = 0; x < cpc; x++) {
                        System.out.println("¿Cuál es el nombre del dispositivo?");
                        String nombre = scanner.next();
                        System.out.println("¿Cuánta memoria RAM tiene?");
                        double RAM = scanner.nextDouble();
                        System.out.println("¿Cuál es el procesador del dispositivo?");
                        String procesador = scanner.next();
                        System.out.println("¿Cuál es la marca de teclado de tu dispositivo?");
                        String marcaTeclado = scanner.next();
                        PC datosPC = new PC(nombre, RAM, procesador, marcaTeclado);
                        pc[x] = datosPC;
                    }
                }break;
                case 3:{
                    System.out.println("Cuantos dispositivos deseas crear?");
                    int cs=scanner.nextInt();
                    servidor=new Servidor[cs];
                    for(int x=0; x<cs; x++){
                        System.out.println("¿Cuál es el nombre del dispositivo?");
                        String nombre=scanner.next();
                        System.out.println("¿Cuánta memoria RAM tiene?");
                        double RAM=scanner.nextDouble();
                        System.out.println("¿Cuál es el procesador del dispositivo?");
                        String procesador=scanner.next();
                        System.out.println("¿Cómo describiría la calidad de red del dispositivo?");
                        String calidadRed=scanner.next();
                        System.out.println("¿Cuál es la zona horaria del dispositivo?");
                        String zonaHoraria=scanner.next();
                        Servidor datosServidor= new Servidor(nombre,RAM,procesador,calidadRed,zonaHoraria);
                        servidor[x]=datosServidor;
                    }
                }break;
                case 4:{
                    int funcion=0;
                    System.out.println("Funciones especiales, ¿huh? ¿Qué deseas hacer? [1]Envíar mensaje, [2]Encender WebCam, [3]Aumentar RAM");
                    funcion=scanner.nextInt();
                    if (funcion==1){
                        System.out.println("Escribe un mensaje");
                        String mensaje=scanner.next();
                        Celular celular1=new Celular("iPhone",200,"idk",200);
                        System.out.println("Tu mensaje: "+ mensaje+ " fue enviado con éxito, tu saldo actual es: ");
                        celular1.enviarSMS(-1);
                    }else if(funcion==2){
                        PC pc1=new PC("iMac",30,"idk2","acer");
                        pc1.encenderWebCam();

                    }else if(funcion==3);
                    System.out.println("¿Cuánta ram quieres aumentar?");
                    int nuevaram=scanner.nextInt();
                    Dispositivo dispositivo1=new Dispositivo("sdasfa",21,"dfdf");
                    System.out.println("Tu nueva ram es: ");
                    dispositivo1.subRam(nuevaram);
                }break;
                case 5:{
                    System.out.println("Estos son los celulares registrados: ");
                    if(celular.length!=0){
                        for(int c=0; c<celular.length; c++/*<---como el lenguaje:D*/ ){
                            System.out.println("Celular "+(c+1)+":"+celular[c].getNombre()+", con una RAM de: "+celular[c].getRam()+", un procesador:"+celular[c].getProcesador() +" y cuenta con un saldo de: "+celular[c].getSaldo());
                        }
                    }else{
                        System.out.println("No has registrado nada, ¿qué te voy a mostrar? Registra algo y vuelve;)");
                    }
                    if(pc.length!=0){
                        for(int p=0; p<pc.length; p++){
                            System.out.println("PC "+(p+1)+":"+pc[p].getNombre()+", con una RAM de: "+pc[p].getRam()+", un procesador:"+pc[p].getProcesador() +", su marca de teclado es: "+pc[p].getMarcaTeclado());
                        }
                    }else if (celular.length==0 && pc.length==0){
                        System.out.println("¿Aquí tampoco metiste nada? Oye, escucha, soy una computadora, tampoco tengo mucho que hacer, pero, hermano, no perdamos nuestro tiempo");
                    }else if(pc.length==0){
                        System.out.println("No has registrado nada, ¿qué te voy a mostrar? Registra algo y vuelve;)");
                    }
                    if(servidor.length!=0){
                        for(int s=0; s<servidor.length; s++){
                            System.out.println("Servidor "+(s+1)+":"+servidor[s].getNombre()+", con una RAM de: "+servidor[s].getRam()+", un procesador:"+servidor[s].getProcesador() +", tiene una calidad de red: "+servidor[s].getCalidadRed()+ " y esta es su zona horaria: "+ servidor[s].getZonaHoraria());
                        }
                    }else if (celular.length==0 && pc.length==0 && servidor.length==0){
                        System.out.println("Brother, esto ya es un chiste, ¿por qué no vuelver allá y registras algún dato? Aquí te espero>:(");
                    }else if(servidor.length==0){
                        System.out.println("No has registrado nada, ¿qué te voy a mostrar? Registra algo y vuelve;)");
                    }
                }break;
                case 6:{
                    System.out.println("Adiooos!:D, un gusto conocerte humano que no registra bien sus datos<3");
                }
            }//switch
        }

    }
}
