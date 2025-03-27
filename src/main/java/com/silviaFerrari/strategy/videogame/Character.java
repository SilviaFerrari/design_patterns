package com.silviaFerrari.strategy.videogame;

// context

public class Character {
    FightStrategy fightBehavior;

    public Character(FightStrategy fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    public void fight(){
        fightBehavior.fight();
    }
}