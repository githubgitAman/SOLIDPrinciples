package dev.aman;

public class Peacock extends Bird implements Dance, Fly{
    @Override
    public void fly() {
        System.out.println("Peacock flying");
    }

    @Override
    public void dance() {
        System.out.println("Peacock dance");
    }

    @Override
    public void eat() {
        System.out.println("Peacock eat");
    }
}
