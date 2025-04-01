package com.silviaFerrari.strategy.videogame;

/*
 * In this case the CONTEXT (Character) is an abstractFactory class, so
 * it needs to be implemented. This allows you to set by default the
 * behavior of each character that specializes Character.
 * Instead, if you want a Strategy implementation in which
 * the behavior is changed on a same instance of the CONTEXT class,
 * look at the "sort" package.
*/

public class Main {
    public static void main(String[] args) {
        Character wrestler = new Wrestler();
        wrestler.display();
        wrestler.fight();

        Character magician = new Magician();
        magician.display();
        magician.fight();

        Character knight = new Knight();
        knight.display();
        knight.fight();
    }
}
