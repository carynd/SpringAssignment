package Interfaces;

public class Fruit implements Tomatoe{
    @Override
    public void hasAPeel() {
        System.out.println("Mostly yes fruits have peel");
    }

    @Override
    public void hasARoot() {
        System.out.println("No fruits are roots");
    }
}
