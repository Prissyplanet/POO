public class Dispositivo {
private String nombre;
private double Ram;
public String procesador;
private String usuario;
private String contraseña;
public Dispositivo(String nombre, double Ram, String procesador){
    this.nombre=nombre;
    this.Ram=Ram;
    this.procesador=procesador;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRam(double Ram) {
        Ram = Ram;
    }

    public double getRam() {
        return Ram;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }
    public void encender(){
        System.out.println("Hola:D");
    }
    public void apagar(){
        System.out.println("AdiósD:");
    }
    public void subRam(int Ram){
        this.Ram=this.Ram+Ram;
    }
    public boolean Ram(String Ram){
        if(Ram.equals(this.Ram)){
            return true;
        }else{
            return false;
        }
    }
}
