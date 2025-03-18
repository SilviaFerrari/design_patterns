package com.silviaFerrari.decorator.pizza;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 1.5;
    }
}
