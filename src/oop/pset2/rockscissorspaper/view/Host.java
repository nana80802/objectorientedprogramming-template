package oop.pset2.rockscissorspaper.view;

import oop.pset2.rockscissorspaper.model.Result;

public class Host {
    public void sayWellcome() {
        print("Host - Welcome to the Rock, Scissors, Paper tournament!");
    }

    public void sayBye() {
        print("Good Bye Baby!");
    }

    public void show(Result result) {
        print("The result of this round is.... !");
        print("Player 1 move: " + result.getP1m().getType());
        print("Player 2 move: " + result.getP2m().getType());
        print(result.getWinner());
    }
    private void print(String s) {
        System.out.println(s);
    }

}
