package com.silviaFerrari.strategy.videogame;

// concrete strategy

public class MagicFight implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Magician: I'll blow you away with my spell!");
    }
}
