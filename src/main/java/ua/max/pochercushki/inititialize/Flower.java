package ua.max.pochercushki.inititialize;

import ua.max.pochercushki.print.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 03.11.13
 * Time: 23:54
 * To change this template use File | Settings | File Templates.
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        Print.print("constructor with parameter int: " + petalCount);
    }

    Flower(String ss) {
        Print.print("constructor with parameter String: " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        //this(s);
        this.s = s;
        Print.print("arguments strig and integer");

    }

    Flower() {
        this("hi", 47);
        Print.print("default constructor without arguments");
    }

    void printPetalCount() {
        Print.print("petalCount " + petalCount + "s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();

    }
}