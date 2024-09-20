package heritage;

public class Program {
    public static void main(String[] args){

        for(int i = 0; i <= 15; i++){
            String out = "";
            for(int j = 0; j < i; j++){
                out += "*";
            }
            System.out.println(out);
        }
//        Account acc1 = new Account(1001, "Alex", 1000.0);
//        acc1.withdraw(200.0);
//        System.out.println(acc1.getBalance());
//
//        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//        acc2.withdraw(200);
//        System.out.println(acc2.getBalance());
//
//        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.5);
//        acc3.withdraw(200);
//        System.out.println(acc3.getBalance());
//        Account acc = new Account(1001, "Alex", 0.0);
//        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//
//        //Upcasting subClasse para superclasse
//        //Isso aqui não da erro, pq herança é uma relação é um, ou seja BusinessAccount é uma Account, mesma coisa com Savings
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0); // vale o "é um"
//        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//        // É normal voce pegar um objeto da sub e atribuir para super
//
//        //Downcasting: SuperClasse para subClasse
//        BusinessAccount acc4 = (BusinessAccount) acc2; // Erro, pq não é possivel ter um subclasse como super, é preciso fazer manuamente
//        acc4.loan(100.0);
//
//
//        if(acc3 instanceof BusinessAccount){
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(100.0);
//            System.out.println("Loan");
//        }
//        if (acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("Update");
//        }


    }
}
