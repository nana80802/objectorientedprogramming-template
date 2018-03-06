package oop.pset2.rockscissorspaper.model;

public class Result {
    private Move p1m;
    private Move p2m;
    private String winner;

    public Move getP1m() {
        return p1m;
    }

    public void setP1m(Move p1m) {
        this.p1m = p1m;
    }

    public Move getP2m() {
        return p2m;
    }

    public void setP2m(Move p2m) {
        this.p2m = p2m;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
