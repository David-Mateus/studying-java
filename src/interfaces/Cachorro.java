package interfaces;

public class Cachorro implements Animal{
    //Polimorfismo
    @Override
    public void fazerSom() {
        System.out.print("AU AU");
    }

    @Override
    public void mover() {
        System.out.print("Andou");

    }
}
