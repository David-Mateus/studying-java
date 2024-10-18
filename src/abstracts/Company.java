package abstracts;

public class Company extends TaxPayer{
    private Integer numberOfEmployees;
    public Company(){}
    public Company(String name, Double anualIncome, int numberOfEmployees){
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double tax = getNumberOfEmployees() < 10 ? 0.14 : 0.16;
        return (getAnualIncome() * tax );
    }
}
