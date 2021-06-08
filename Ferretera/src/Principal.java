public class Principal {
    public static void main(String[] args) {
        Admin admin1=new Admin("admin","contraseña","Fernando","Hacienda de Ramos #1311","6361164999");
        Cashier cashier1=new Cashier("cashier","cajeromacizo","Jimmy","Obrera #2002","6361013379");
        cashier1.makePayement();
        User cashier2=new Cashier("cashier1","cajeronomacizo","pepe","Zaragoza #2003","6361019192");
        Client client1=new Client(2000,2500,"Alfredo","a","234567");
        Order order1=new Order(client1,cashier1);
        System.out.println(order1.getTotal());

    }
}
