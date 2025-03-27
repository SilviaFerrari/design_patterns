package com.silviaFerrari.strategy.videogame;

// concrete strategy

public class FencingFight implements Fight{
    @Override
    public void fight() {
        System.out.println("Knight: I'll run you through with my sword!");
    }
}
