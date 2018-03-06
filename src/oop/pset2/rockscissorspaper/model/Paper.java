package oop.pset2.rockscissorspaper.model;

public class Paper implements Move {
    @Override
    public MoveType getType() {
        return MoveType.paper;
    }
}
