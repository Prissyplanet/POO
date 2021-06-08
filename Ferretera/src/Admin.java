public class Admin extends User {
    public Admin(String userName, String password, String name, String address, String phone) {
        super(userName, password, name, address, phone);
    }
    public void changePassword(String nuevoPassword){
        super.setPassword(nuevoPassword);
    }
}
