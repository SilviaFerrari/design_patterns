package com.silviaFerrari.strategy.videogame;

public class Main {
    public static void main(String[] args) {
        Character wrestler = new Wrestler(new BoxingFight());
        wrestler.fight();

        Character magician = new Magician(new MagicFight());
        magician.fight();

        Character knight = new Knight(new FencingFight());
        knight.fight();
    }
}
