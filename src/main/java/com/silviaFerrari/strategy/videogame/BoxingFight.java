package com.silviaFerrari.strategy.videogame;

// concrete strategy

public class BoxingFight implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Wrestler: I'll beat you to death!");
    }
}
