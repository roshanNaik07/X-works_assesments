package com.xworkz.external;

import com.xworkz.internal.Lobby;

public class Game {

    Lobby lobby;

    public Game(Lobby lobby) {
        this.lobby = lobby;
        System.out.println("Running no arg const of Game");
    }

    public void play() {
        if (this.lobby != null) {
            System.out.println("Running play in Game");
            this.lobby.selcetMap();
        } else {
            System.err.println("Lobby is null");
        }
    }
}
