package dev.aman;

public class Ostrich extends Bird{
    @Override
    public void eat() {
        System.out.println("Ostrich eat");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich don't fly");
    }
}
