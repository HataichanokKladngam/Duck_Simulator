package ku.cs.controller;

import ku.cs.repository.Quackable;

public class RubberDuck implements Quackable {
    public void quack() {
        System.out.println("Squeak");
    }
}
