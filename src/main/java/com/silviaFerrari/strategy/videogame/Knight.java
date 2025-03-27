package com.silviaFerrari.strategy.videogame;

public class Knight extends Character {
    public Knight(FightStrategy fightBehavior) {
        super(fightBehavior);
    }

    public void display() {
        System.out.println("I'm a knight.");
    }

    @Override
    public void fight() {
        super.fight();
    }
}