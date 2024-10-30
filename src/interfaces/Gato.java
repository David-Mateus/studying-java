package interfaces;

public class Gato implements Animal{
    //Polimorfismo
    @Override
    public void fazerSom() {
        System.out.print("Miau");
    }

    @Override
    public void mover() {
        System.out.print("Andou");
    }
}
