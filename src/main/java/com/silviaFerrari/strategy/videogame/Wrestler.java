package com.silviaFerrari.strategy.videogame;

public class Wrestler extends Character {
    public Wrestler() {
        fightBehavior = new BoxingFight();
    }

    public void display() {
        System.out.println("I'm a wrestler!");
    }
}
