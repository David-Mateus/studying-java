package dio;

public abstract class Conta {
    private String cliente;
    private Integer num_conta;
    protected Double saldo;

    public Conta(){}
    public Conta(String cliente, Integer num_conta, Double saldo){
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(Integer num_conta) {
        this.num_conta = num_conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    void withdraw(double withdraw){
        if(withdraw < saldo) {
            saldo -= withdraw;
        }
    }
    void deposit(Double deposit){
        saldo += deposit;
    }
}
