package oop.pset2.rockscissorspaper.model;

public class Scissors implements Move {
    @Override
    public MoveType getType() {
        return MoveType.scissors;
    }
}
