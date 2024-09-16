package heritage;

public class ContaEspacial extends ContaBancaria{
    private Double limite;
    public ContaEspacial(){}
    public ContaEspacial(String cliente, Integer num_conta, Double saldo, Double limite){
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double saque) {
        if(saldo <= saldo + limite){
            saldo -= saque;
        }
    }
}
