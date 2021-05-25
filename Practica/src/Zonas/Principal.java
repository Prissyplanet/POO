package Zonas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de provincias");
        int opcion=0;
        Scanner scanner=new Scanner(System.in);
        Zona[] zona= new Zona[0];
        Pais[] pais= new Pais[0];
        while(opcion!=4){
            System.out.println("¿Qué desea hacer? [1]Crear zona geográfica, [2] Crear provincia, [3]Mostrar datos, [4]Salir ");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:{
                //Crear zona
                    System.out.println("¿Cuántas zonas deseas crear?");
                    int cz=scanner.nextInt();
                    zona=new Zona[cz];
                    for(int x=0; x<cz; x++){
                        System.out.println("Inserta el nombre de la zona "+ (x+1));
                        String nombre= scanner.next();
                        System.out.println("Inserta la superficie de la zona "+(nombre));
                        double superficie= scanner.nextDouble();
                        Zona datosZona= new Zona(nombre,superficie);
                        zona[x]=datosZona;
                    }
                }break;
                case 2:{
                    //Crear provincia
                    System.out.println("¿Cuántas provincias deseas crear?");
                    int cp=scanner.nextInt();
                    pais=new Pais[cp];
                    for(int y=0; y<cp; y++){
                        System.out.println("Inserta el nombre de la provinicia " +(y+1));
                        String nombre= scanner.next();
                        System.out.println("Inserta la superficie de la provincia "+(nombre));
                        double superficie= scanner.nextDouble();
                        System.out.println("¿Qué idioma se habla en "+(nombre)+"?");
                        String idioma=scanner.next();
                        System.out.println("¿Cuál es la moneda nacional de "+(nombre)+"?");
                        String moneda= scanner.next();
                        System.out.println("¿Quién es el presidente de "+(nombre)+"?");
                        String presidente= scanner.next();
                        Pais datosPais= new Pais(nombre,superficie,idioma,moneda,presidente);
                        pais[y]=datosPais;
                    }
                }break;
                case 3:{
                    System.out.println("Estos son los datos que han sido insertados en zonas: ");
                    if(zona.length!=0) {
                        for (int z=0; z<zona.length; z++) {
                            System.out.println("Zona "+ (z+1)+": "+ zona[z].getNombre()+ " con "+ zona[z].getSuperficie()+"km"  );
                        }
                    }else{
                        System.out.println("No se han insertado datos de zonas");
                    }
                    System.out.println("Estos son los datos que han sido insertados en provincias: ");
                    if(pais.length!=0){
                        for(int w=0; w<pais.length; w++){
                            System.out.println("Provincia "+ (w+1)+": "+pais[w].getNombre()+" con "+ pais[w].getSuperficie()+"km."+ " Su idioma es "+ pais[w].getIdioma()+", su presidente es: "+ pais[w].getPresidente());
                        }
                    }else{
                        System.out.println("No se han insertado datos de provincias carnal");
                    }
                }break;
                case 4:{
                    System.out.println("AdioOOooooooOooooOOOooos... si no saco 10 me mato:)))) ");
                }break;

            }
        }
    }
}

