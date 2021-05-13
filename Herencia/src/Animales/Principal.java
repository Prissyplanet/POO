package Animales;

import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

      /*  int[] miArray= new int[4];
        String[] str;
        miArray[0]=100;
        miArray[1]=2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("¿Cuántos registros deseas?");
        int c= scanner.nextInt();
        str=new String[c];
        for(int x=0; x<c; x++ ){
            System.out.println("Inserta un nombre");
            String n= scanner.next();
            str[x]=n;
        }
        imprimirArreglo(str); */
        Ave[] arrayAves=new Ave[3];
        Animal pipo=new Animal(Color.black,2323);
        Ave Kowalsky=new Ave(Color.black,40,"pinqüino");
        arrayAves[0]=Kowalsky;
        arrayAves[1]= new Ave(Color.yellow, 55,"canario");
        System.out.println(arrayAves[1].getTipo());



        Perro Jupiter=new Perro(Color.white,20,"york");
        Jupiter.ladrar();
        pipo.comer();
        Kowalsky.moverse();
        Kowalsky.volar();

    }

    public static void imprimirArreglo(String[] arr){
        for(int x=0; x<arr.length; x++){
            System.out.println( arr[x]);
        }


    }
}
