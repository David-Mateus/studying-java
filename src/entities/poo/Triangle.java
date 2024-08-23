package entities.poo;

public class Triangle {
    public double xT;
    public double yT;
    public double zT;


    public double area(){
        double p =  (xT + yT + zT) / 2.0;
        return Math.sqrt(p * (p - xT) * (p - yT) * (p - zT));
    }
}
