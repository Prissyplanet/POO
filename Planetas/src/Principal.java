import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
      /*  Planet x= new Planet("Tierra",1500,"solida",365,50000);
        Planet y= new Planet("Júpiter",15384593,"gaseosa",4329,654867458);
        Planet z= new Planet("Saturno", 12344, "gaseosa",10585,90000);

        Asteroid a=new Asteroid("KPDP","solida",5000,342347832);
        Asteroid b=new Asteroid("AFPA", "solida", 89000, 1010100);
        Asteroid c=new Asteroid("TAAP","solida",234567,87548);
        System.out.println(x.getName());
        System.out.println(a.getSpeed());
        System.out.println(b.getComposition());
        System.out.println(a.getName()); */
        int opcion=0;
        Scanner scanner= new Scanner(System.in);
        while(opcion!=4){
            System.out.println("¿Qué desea hacer? \n 1)Crear estrella \n 2)Crear asteroide \n 3)Crear planeta \n 4)salir");
                opcion=scanner.nextInt();
                switch (opcion){
                    case 1:{
                        //crear estrella
                        System.out.println("introduce el diámetro:");
                        double d=scanner.nextDouble();
                        System.out.println("Escribe el tipo de estrella \n 1)Enana roja \n 2)Enana blanca \n 3)Supernova \n 4) Del mario bros:0");
                        int t=scanner.nextInt();
                        String tipo="";
                        if(t==1){
                            tipo="Enana roja";
                        }else if(t==2){
                            tipo="Enana blanca";
                        }else if(t==3){
                            tipo="Supernova";
                        }else if(t==4){
                            tipo="del mario bros:0";
                        }else{
                            tipo="estrella normal";
                        }
                        System.out.println("Escribe el color de la estrella \n 1)roja \n 2)blanca \n 3)azul \n 4)amarilla");
                        int c=scanner.nextInt();
                        Color color=Color.BLACK;
                        if(c==1){
                            color=Color.RED;
                        }else if(c==2){
                            color=Color.white;
                        }else if(c==3){
                            color=Color.BLUE;
                        }else if(c==4){
                            color=Color.yellow;
                        }
                        Star estrella1=new Star(d,tipo,color);
                        System.out.println("La estrella que creaste es:\nDiametro: "+estrella1.getDiameter()
                                +"\nTipo: "+estrella1.getType()
                                +"\nColor: "+estrella1.getColor().toString());
                        break;}
                    case 2:{
                        //Crear asteroide
                        System.out.println("Introduce el nombre del asteroide:");
                        String n=scanner.next();
                        System.out.println("Escribe la composición del asteroide: 1) gaseosa 2)sólida");
                        int c=scanner.nextInt();
                        String composicion="";
                        if(c==1){
                            composicion="Gaseosa";
                            }else if(c==2) {
                            composicion = "Sólida";
                            }else{
                            System.out.println("No válida");
                        }
                        System.out.println("Escribe la distancia del asteroide a la Tierra");
                        int d=scanner.nextInt();
                        System.out.println("Escribe la velocidad del asteroide");
                        double v=scanner.nextDouble();
                        Asteroid asteroide1=new Asteroid(n,composicion,d,v);
                        System.out.println("Este es el asteroide que creaste:\nNombre: "+asteroide1.getName()
                        +"\nComposición: "+asteroide1.getComposition()
                        +"\nDistania con la tierra: "+asteroide1.getDistance_of_earth()
                        +"\nVelocidad: "+asteroide1.getSpeed());
                        break;}

                    case 3:{
                        //Crear planeta
                        System.out.println("Esribe el nombre del planeta:");
                        String n=scanner.next();
                        System.out.println("Escribe la distancia del planeta respecto al sol de su sistema");
                        double d=scanner.nextDouble();
                        System.out.println("Escribe la composición del planeta: 1)Gaseosa 2)Sólida");
                        int c=scanner.nextInt();
                        String composicion="";
                        if(c==1){
                            composicion="Gaseosa";
                        }else if(c==2) {
                            composicion = "Sólida";
                        }else{
                            System.out.println("No válida");
                        }
                        System.out.println("Escribe los días de órbita del planeta: ");
                        int dias=scanner.nextInt();
                        System.out.println("Esribe la masa del planeta");
                        double m= scanner.nextDouble();
                        Planet planeta1=new Planet(n,d,composicion, dias,m);
                        System.out.println("Este es el planeta que creaste: \nNombre: "+planeta1.getName()
                        +"\nDistancia con su Sol: "+planeta1.getSunDistance()
                        +"\nComposición: "+planeta1.getComposition()
                        +"\nDías de órbita: "+planeta1.getOrbitDays()
                        +"\nMasa: "+planeta1.getMass());
                        break;}
                    case 4:{break;}
                    default:{
                        System.out.println("opción no válida");
                    }
                }//llave switch
        }//llave while
        System.out.println("Gracias por utilizar el programa");

    }//llave main

}//llave class
