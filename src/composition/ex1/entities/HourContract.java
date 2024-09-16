package composition.ex1.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHur;
    private Integer hours;

    public HourContract(){}

    public HourContract(Date date, Double valuePerHur, Integer hours) {
        this.date = date;
        this.valuePerHur = valuePerHur;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHur() {
        return valuePerHur;
    }

    public void setValuePerHur(Double valuePerHur) {
        this.valuePerHur = valuePerHur;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    //method
    public double totalValue(){
        return valuePerHur * hours;
    }
}
