package com.silviaFerrari.decorator.pizza;

public class Main {
    public static void main(String[] args) {
        // Create a plain pizza
        Pizza pizza = new PlainPizza();
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getPrice());

        // Decorate the pizza with cheese and pepperoni
        pizza = new CheeseDecorator(pizza);
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getPrice());

        pizza = new PepperoniDecorator(pizza);

        // Get the description and cost of the decorated pizza
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getPrice());
    }
}
