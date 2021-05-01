package Animales;

import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        Animal pipo=new Animal(Color.black,2323);
        Ave Kowalsky=new Ave(Color.black,40,"pinqüino");
        Perro Jupiter=new Perro(Color.white,20,"york");
        Jupiter.ladrar();
        pipo.comer();
        Kowalsky.moverse();
        Kowalsky.volar();

    }
}
