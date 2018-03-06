package oop.pset2.rockscissorspaper.controller;

import oop.pset2.rockscissorspaper.model.Move;
import oop.pset2.rockscissorspaper.model.MoveType;
import oop.pset2.rockscissorspaper.model.Result;
import oop.pset2.rockscissorspaper.model.Winner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Judge {
    public Result getResult(Move m1, Move m2) {
        Result result = new Result();
        result.setP1m(m1);
        result.setP2m(m2);
        result.setWinner(getWinner(m1, m2));
        return result;
    }

    private String getWinner(Move m1, Move m2) {
        if (m1.getType().equals(m2.getType()))
            return "Draw!";
        if (playerOneWins(m1, m2))
            return "Player 1 Wins!";
        return "Player 2 Wins!";
    }

    private boolean playerOneWins(Move m1, Move m2) {
        return Stream.of(
                new Winner(MoveType.rock, MoveType.scissors),
                new Winner(MoveType.scissors, MoveType.paper),
                new Winner(MoveType.paper, MoveType.rock))
                .collect(Collectors.toSet())
                .stream()
                .anyMatch(e -> e.getM1() == m1.getType() && e.getM2() == m2.getType());
    }
}
