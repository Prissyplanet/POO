public class Client extends Person{
    private double credit;
    private double max_credit;
    public Client(double credit,double max_credit, String name, String address, String phone) {
        super(name, address, phone);
        this.credit=credit;
        this.max_credit=max_credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setMax_credit(double max_credit) {
        this.max_credit = max_credit;
    }

    public double getMax_credit() {
        return max_credit;
    }
}
