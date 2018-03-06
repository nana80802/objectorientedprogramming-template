package oop.pset2.rockscissorspaper.model;

public class Rock implements Move {
    @Override
    public MoveType getType() {
        return MoveType.rock;
    }
}
