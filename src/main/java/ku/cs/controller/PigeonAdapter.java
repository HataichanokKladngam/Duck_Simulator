package ku.cs.controller;

import ku.cs.repository.Quackable;

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;
    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }
    public void quack() {
        pigeon.coo();
    }

}
