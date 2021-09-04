import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        int array[][] = new int[4][4];
        int number = 0;
        int resultado=0;
        Scanner scanner = new Scanner(System.in);
        array[0][0] = 10;
        array[0][1] = 2;
        array[0][2] = 4;
        array[0][3] = 10;

        array[1][0] = 15;
        array[1][1] = 5;
        array[1][2] = 5;
        array[1][3] = 8;

        array[2][0] = 20;
        array[2][1] = 2;
        array[2][2] = 4;
        array[2][3] = -1;

        array[3][0] = 30;
        array[3][1] = 1;
        array[3][2] = 5;
        array[3][3] = 3;

        int fila1 = array[0][0] + array[0][1] + array[0][2] + array[0][3];
        int fila2 = array[1][0] + array[1][1] + array[1][2] + array[1][3];
        int fila3 = array[2][0] + array[2][1] + array[2][2] + array[2][3];
        int fila4 = array[3][0] + array[3][1] + array[3][2] + array[3][3];
        int suma = fila1 + fila2 + fila3 + fila4;
        System.out.println("La suma de todos los valores es: " + suma);
            System.out.println("¿Qué número deseas multiplicar?");
            number = scanner.nextInt();
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    resultado = number * array[x][y];
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                }
            }//Me acabo de dar cuenta de que este ciclo se puede aplicar para la suma, peeeero, ya lo hice y tengo sueño jajja:(
        int diagonal=0;
        for (int x=0;x<4;x++){
            diagonal=diagonal+ array[x][x];
        }
        System.out.println("La suma de las diagonales es: " +diagonal);



    }

}
