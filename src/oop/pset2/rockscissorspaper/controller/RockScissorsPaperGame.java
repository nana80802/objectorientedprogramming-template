package oop.pset2.rockscissorspaper.controller;

import oop.pset2.rockscissorspaper.model.*;
import oop.pset2.rockscissorspaper.view.Host;

import java.util.List;

public class RockScissorsPaperGame {
    private Host host = new Host();
    private Judge judge = new Judge();

    public void play() {
        host.sayWellcome();
        List<Player> players = PlayerFactory.getTwoPlayers();
        Boolean playAgain = true;
        while (playAgain){
            playOneMore(players);
            playAgain = ask(players);
        }
        host.sayBye();
    }

    private void playOneMore(List<Player> players) {
        Move m1 = players.get(0).getMove();
        Move m2 = players.get(1).getMove();
        Result result = judge.getResult(m1, m2);
        host.show(result);
    }

    private Boolean ask(List<Player> players) {
        return players.get(0).playAgain() && players.get(1).playAgain();
    }
}
