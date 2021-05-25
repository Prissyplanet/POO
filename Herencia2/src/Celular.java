public class Celular extends Dispositivo {
    protected int saldo;
    public Celular(String nombre, double Ram, String procesador, int saldo){
       super(nombre,Ram,procesador);
        this.saldo=saldo;

    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void enviarSMS(int saldo){
            this.saldo= this.saldo+saldo;
    }
    @Override
    public boolean Ram(String Ram) {
        System.out.println("Acceso denegado"+ super.getNombre());
        return false;

    }
}
