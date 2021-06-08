import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo=new Circulo(Color.black,21.09);
        Cuadrado cuadrado=new Cuadrado(Color.blue,12,12);
        System.out.println(circulo.calcularArea());
        System.out.println(cuadrado.calcularArea());

    }


}
