import java.util.Scanner;

public class Order implements NewOrder{
    private double total;
    private Part[] parts;
    private Client client;
    private Cashier cashier;
    public Order(Client client,Cashier cashier){
        this.client=client;
        this.cashier=cashier;
        this.setParts();
    }
    @Override
    public void setParts() {
        System.out.println("Cuántas partes necesitas?");
        Scanner scanner=new Scanner(System.in);
        int cuantas=scanner.nextInt();
        parts=new Part[cuantas];
        for(int x=0;x<cuantas;x++){
            parts[x]=new Part("parte "+x,200*x,"SEXDRCFTVGYBHNJ");
        }
        this.setTotal();
    }

    @Override
    public void setClient() {

    }

    @Override
    public void setTotal() {
        for(int x=0;x<parts.length;x++){
            total=total+parts[x].getPrice();

        }
    }

    public double getTotal() {
        return total;
    }
}
