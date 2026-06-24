package dev.aman;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dance peacock = new Peacock();
        //Now we have different interfaces for dance and fly
        // i.e no tight coupling so it shows Dependencies Inversion Principle
        peacock.dance();
    }
}