package dev.aman;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FlyingDance ostrich = new Ostrich();
        //Ostrich don't fly but we are implementing FlyingDance interface
        ostrich.fly();
    }
}