package oop.pset2.rockscissorspaper.model;

import oop.pset2.rockscissorspaper.controller.MoveFactory;

import java.util.List;
import java.util.Scanner;

public class HumanPlayer implements Player{

    Scanner scanner = new Scanner(System.in);
    @Override
    public Move getMove() {
        List<Move> moves = new MoveFactory().makeMoves();
        print("Write your move (rock, scissors, paper):");
        String humanMove = scanner.nextLine();
        return toHumanMove(humanMove, moves);
    }

    private Move toHumanMove(String humanMove, List<Move> moves) {
       return moves.stream()
                .filter(move -> move.getType().toString().equalsIgnoreCase(humanMove))
               .findFirst()
               .get();
    }

    @Override
    public boolean playAgain() {
        print("Do you want to play again? (y/n): ");
        return scanner.nextLine().equalsIgnoreCase("y");
    }

    private void print(String s) {
        System.out.print(s);
    }

}
