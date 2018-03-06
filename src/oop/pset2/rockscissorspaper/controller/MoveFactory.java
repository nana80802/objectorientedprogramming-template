package oop.pset2.rockscissorspaper.controller;

import oop.pset2.rockscissorspaper.model.Move;
import oop.pset2.rockscissorspaper.model.Paper;
import oop.pset2.rockscissorspaper.model.Rock;
import oop.pset2.rockscissorspaper.model.Scissors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveFactory {
    public List<Move> makeMoves(){
        return Stream.of(
                new Rock(),
                new Scissors(),
                new Paper())
                .collect(Collectors.toList());
    }
}
