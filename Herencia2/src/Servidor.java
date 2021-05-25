import java.util.Scanner;

public class Servidor extends Dispositivo{
    public String calidadRed;
    public String zonaHoraria;
    public Servidor(String nombre, double Ram, String procesador, String calidadRed, String zonaHoraria ){
        super(nombre,Ram,procesador);
        this.calidadRed=calidadRed;
        this.zonaHoraria=zonaHoraria;
    }

    public void setCalidadRed(String attribute1) {
        this.calidadRed = attribute1;
    }

    public String getCalidadRed() {
        return calidadRed;
    }

    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }
    public void aumentarRam(){
        Scanner scanner=new Scanner(System.in);
        double aumentoRam=0;
        System.out.println("¿Cuánto quieres que aumente la RAM de tu dispositivo?");
        aumentoRam=scanner.nextDouble();
        System.out.println("Esta es la nueva RAM: "+(getRam()+aumentoRam));
    }
}
