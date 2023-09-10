package ku.cs.controller;

import ku.cs.repository.Quackable;

public class MallardDuck implements Quackable {
    public void quack() {
        System.out.println("Quack");
    }
}