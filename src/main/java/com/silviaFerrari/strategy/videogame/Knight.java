package com.silviaFerrari.strategy.videogame;

public class Knight extends Character {
    public Knight() {
        fightBehavior = new FencingFight();
    }

    public void display() {
        System.out.println("I'm a knight!");
    }
}