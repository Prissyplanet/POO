public class PC extends Dispositivo {
    public String marcaTeclado;
    public PC(String nombre, double Ram, String procesador, String marcaTeclado){
        super(nombre,Ram,procesador);
        this.marcaTeclado=marcaTeclado;
    }

    public void setMarcaTeclado(String marcaTeclado) {
        this.marcaTeclado = marcaTeclado;
    }

    public String getMarcaTeclado() {
        return marcaTeclado;
    }
    public void encenderWebCam(){
        System.out.println("WebCam encendida;D");
    }
}
