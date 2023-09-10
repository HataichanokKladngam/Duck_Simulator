package ku.cs.controller;

import ku.cs.repository.Quackable;

public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}
