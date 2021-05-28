public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
     public Usuario(String nombre,String apellido, String usuario, String contraseña){
         this.nombre=nombre;
         this.apellido=apellido;
         this.usuario=usuario;
         this.contraseña=contraseña;
     }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }
    public boolean iniciarSesion(String usuario, String contraseña){
        if(usuario.equals(this.usuario) && contraseña.equals(this.contraseña)){
            return true;
        }else{
            return false;
        }
    }
    public void decirHola(){
        System.out.println("Decir hola desde la clase usuario:D");
    }
    public int cobrarCheque(){
         return 500*7;
    }
}
