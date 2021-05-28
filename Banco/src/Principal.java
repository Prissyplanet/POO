public class Principal {
    public static void main(String[] args) {
        Usuario usuraio1= new Usuario("Fernando","Amaya","Prissyplanet","contraseña");
        boolean respuesta=usuraio1.iniciarSesion("Prissyplanet","heehee");
        //System.out.println("Login: "+ respuesta);
        Cliente cliente1= new Cliente("Pepe","Torres","costumer","ahioahio",110);
        cliente1.cargarSaldo(100);
        System.out.println("tienes: "+ cliente1.getSaldo());
        boolean respuesta2=cliente1.iniciarSesion("costumer","ahioahio");
        System.out.println("Login: "+ respuesta2);

    }
}
