package ku.cs.controller;

import ku.cs.repository.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    public void quack() {
        goose.honk();
    }
}
