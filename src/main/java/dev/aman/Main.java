package dev.aman;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        ostrich.eat();
        //Violation of LSP i.e our child class is not able to implement parent functionality
        //It is throwing exception
        ostrich.fly();
    }
}