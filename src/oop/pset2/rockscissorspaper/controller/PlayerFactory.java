package oop.pset2.rockscissorspaper.controller;

import oop.pset2.rockscissorspaper.model.ComputerPlayer;
import oop.pset2.rockscissorspaper.model.HumanPlayer;
import oop.pset2.rockscissorspaper.model.Player;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayerFactory {
    public static List<Player> getTwoPlayers() {
        return Stream.of(
                new HumanPlayer(),
                new ComputerPlayer()
        ).collect(Collectors.toList());
    }
}
