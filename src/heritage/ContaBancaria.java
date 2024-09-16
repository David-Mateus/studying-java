package heritage;

public abstract class ContaBancaria {
    private String cliente;
    private Integer num_conta;
    protected Double saldo;

    public ContaBancaria(){}
    public ContaBancaria(String cliente, Integer num_conta, Double saldo) {
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
    public void depositar(double deposito){
        saldo += deposito;
    }
    public void sacar(double saque){
        if(saque < saldo ){
            saldo -= saque;
        }
    }


}
