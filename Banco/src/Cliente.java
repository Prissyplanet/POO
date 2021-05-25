public class Cliente extends Usuario{
    private double saldo;
    public Cliente(String nombre, String apellido, String usuario, String contraseña, double saldo) {
        super(nombre, apellido, usuario, contraseña);
        this.saldo=saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void cargarSaldo(double saldo){
        this.saldo=saldo+ this.saldo;
    }
    @Override
    public boolean iniciarSesion(String usuario, String contraseña) {
        System.out.println("Acceso denegado"+ super.getNombre());
        return false;

    }
    @Override
    public void decirHola() {
        System.out.println("Decir hola desde la subclase:D");
    }
}
