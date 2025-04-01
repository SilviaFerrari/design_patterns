package com.silviaFerrari.strategy.videogame;

public class Magician extends Character {
    public Magician() {
        fightBehavior = new MagicFight();
    }

    public void display() {
        System.out.println("I'm a magician!");
    }
}
