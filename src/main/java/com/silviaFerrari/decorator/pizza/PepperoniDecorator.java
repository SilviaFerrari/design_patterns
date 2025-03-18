package com.silviaFerrari.decorator.pizza;

public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 2.0;
    }
}
