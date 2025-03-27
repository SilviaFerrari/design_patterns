package com.silviaFerrari.strategy.videogame;

public class Wrestler extends Character {
    public Wrestler(FightStrategy fightBehavior) {
        super(fightBehavior);
    }

    public void display() {
        System.out.println("I'm a wrestler.");
    }

    @Override
    public void fight() {
        super.fight();
    }
}
