package com.silviaFerrari.strategy.videogame;

// context
public abstract class Character {
    FightStrategy fightBehavior;

    public void fight(){
        fightBehavior.fight();
    }

    public abstract void display();
}