package com.silviaFerrari.strategy.videogame;

public class BoxingFight implements Fight {
    @Override
    public void fight() {
        System.out.println("Wrestler: I'll beat you to death!");
    }
}
