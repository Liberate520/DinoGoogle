package model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    static List<Actor> actors;

    public Game() {
        actors = new ArrayList<>();
        actors.add(new Player("resorces/Pink_Monster.png"));
    }

    public void update(){

    }
}
