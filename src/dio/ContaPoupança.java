package dio;

public class ContaPoupança extends Conta{
    private Double tax;
    public ContaPoupança(){}
    public ContaPoupança(String name, Integer num_conta, Double saldo, Double tax){
        super(name, num_conta, saldo);
        this.tax = tax;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    @Override
    public void withdraw(double withdraw){
        super.withdraw(withdraw);
        this.saldo -= tax * withdraw + 5.00;
    }
}
