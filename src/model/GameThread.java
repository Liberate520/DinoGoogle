package model;

public class GameThread extends Thread {

    Game game;

    public GameThread(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        while (true){

        }
    }
}
