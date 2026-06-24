package dev.aman;

public class Ostrich extends Bird implements Dance, Fly {
    @Override
    public void eat() {
        System.out.println("Ostrich eat");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich don't fly");
    }

    @Override
    public void dance() {
        throw new UnsupportedOperationException("Ostrich don't dance");
    }
}
