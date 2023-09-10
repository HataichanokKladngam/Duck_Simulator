package ku.cs.controller;

import ku.cs.repository.Quackable;

public class QuackEcho implements Quackable {
    Quackable duck;
    static String echo;

    public QuackEcho (Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        System.out.print("Echo: ");
        duck.quack();
    }
    public static String getEcho() {
        return echo;
    }
}
