public class Usuario extends Consultorio {
    private String usuario;
    private String contraseña;
    public Usuario(String nombre, String usuario, String contraseña) {
        super(nombre);
        this.usuario=usuario;
        this.contraseña=contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String verCalendariodeCitas() {
        return null;
    }

}
