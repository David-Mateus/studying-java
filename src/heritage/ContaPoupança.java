package heritage;

public class ContaPoupança extends ContaBancaria{
    private Integer rendimento;
    public ContaPoupança(){}
    public ContaPoupança(String cliente, Integer num_conta, Double saldo, Integer rendimento){
        super(cliente, num_conta, saldo);
        this.rendimento = rendimento;
    }

    public Integer getRendimento() {
        return rendimento;
    }

    public void setRendimento(Integer rendimento) {
        this.rendimento = rendimento;
    }
    public void NovoSaldo(double taxaRendimento){
        double novoSaldo = saldo * (taxaRendimento/100);
        saldo += novoSaldo;
    }
}
