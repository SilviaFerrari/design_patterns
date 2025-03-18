package com.silviaFerrari.strategy.videogame;

public class Magician extends Character {
    public Magician(Fight fightBehavior) {
        super(fightBehavior);
    }

    public void display() {
        System.out.println("I'm a magician.");
    }

    @Override
    public void fight() {
        super.fight();
    }
}
