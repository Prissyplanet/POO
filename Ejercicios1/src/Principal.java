import java.util.Scanner;

public class Principal {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu edad:");
        int edad = scanner.nextInt();
        System.out.println("Has vivido " + (edad * 365) + " días");
        if (edad <= 12) {
            System.out.println("!Eres un/a niño/a!");

        } else if (edad >= 13 && edad < 18) {
            System.out.println("¡Eres un/a joven!");

        } else if (edad >= 18) {
            System.out.println("Eres mayor de edad, ¿duele?:(");
        }
        Scanner multi = new Scanner(System.in);
        int z;
        System.out.println("Escribe un número del 1 al 10");
        int num = multi.nextInt();
        if (num >= 1 && num <= 10) {

            for (z = 1; z <= 10; z++) {
                System.out.println(num + "X" + z + "=" + num * z);
            }
        } else {

            System.out.println("El número tiene que estar entre 1 y 10");
        }
    }
}



