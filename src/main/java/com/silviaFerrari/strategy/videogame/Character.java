package com.silviaFerrari.strategy.videogame;

public abstract class Character {
    Fight fightBehavior;

    public Character(Fight fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    public void fight(){
        fightBehavior.fight();
    }
}