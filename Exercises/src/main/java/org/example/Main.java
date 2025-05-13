package org.example;

public class Main {
    public static void main(String[] args) {
        Human hooman = new Human();
        feed("human", hooman);
        Caveman caveJohnson = new Caveman();
        feed("caveman", caveJohnson);
        ModernPerson manny = new ModernPerson();
        feed("modern", manny);
    }

    public static void feed(String label, Human human) {
        System.out.print(label + "--> ");
        human.eat();
    }
}