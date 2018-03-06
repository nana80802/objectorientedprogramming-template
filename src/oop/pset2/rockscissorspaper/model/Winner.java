package oop.pset2.rockscissorspaper.model;

public class Winner {
    public MoveType getM1() {
        return m1;
    }

    public MoveType getM2() {
        return m2;
    }

    public Winner(MoveType m1, MoveType m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    private MoveType m1;
    private MoveType m2;
}
