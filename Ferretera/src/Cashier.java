public class Cashier extends User{
    public Cashier(String userName, String password, String name, String address, String phone) {
        super(userName, password, name, address, phone);
    }
    public void makePayement(){
        System.out.println("Hacer cobro");
    }
}
