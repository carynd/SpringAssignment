package Interfaces;

public class interface_runner {
    public static void main(String[] args) {
        Tomatoe tom=new Fruit();
        tom.hasAPeel();
        tom.hasARoot();

        Tomatoe tom1=new Vegetables();
        tom1.hasARoot();
        tom1.hasAPeel();
    }
}
