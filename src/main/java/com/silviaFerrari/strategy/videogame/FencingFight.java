package com.silviaFerrari.strategy.videogame;

// concrete strategy

public class FencingFight implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Knight: I'll run you through with my sword!");
    }
}
