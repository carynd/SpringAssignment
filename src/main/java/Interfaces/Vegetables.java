package Interfaces;

public class Vegetables implements Tomatoe{
    @Override
    public void hasAPeel() {
        System.out.println("yes vegetables have peel");
    }

    @Override
    public void hasARoot() {
        System.out.println("mostly yes vegetables have root");
    }
}
