package heritage.exercise.produto;

public class ImportedProduct extends Product{
    private Double customsFree;

    public ImportedProduct(){}
    public ImportedProduct(String name, Double price, Double customsFree){
        super(name,price);
        this.customsFree = customsFree;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + "(Customs free: " + getCustomsFree()+" )";
    }
    public Double totalPrice(){
        return getPrice() + getCustomsFree();
    }
}
