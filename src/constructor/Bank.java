package constructor;

public class Bank {
    private   String holder;
    private   int    number;
    private   double deposit;

    public Bank(int number, String holder){
        this.number = number;
        this.holder = holder;

    }
    public Bank(int number, String holder, double deposit){
        this.number = number;
        this.holder = holder;
        this.deposit = deposit;
    }


    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void depositAccount(double deposit){
        this.deposit += deposit;
    }
    public  void withdraw(double withdraw){
        if(withdraw < this.deposit){
            this.deposit -= withdraw + 5.00;
        }else{
            System.out.println("Saque Negado! Valor do saque maior do que permitido");
        }

    }
    public String toString(){
        return "Account "+getNumber()+
                " Holder "+getHolder()+
                " Balance "+getDeposit();
    }
}
