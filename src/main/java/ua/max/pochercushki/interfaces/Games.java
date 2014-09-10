package ua.max.pochercushki.interfaces;

import net.mindview.util.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 10.09.14
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
interface Game {
    boolean moove();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean moove() {
        Print.print("Checkers moove" + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Checkers();
    }
}

public class Games {
}
