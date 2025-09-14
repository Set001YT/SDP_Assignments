package SDP_Assignment_1;

/*
 * Director Class - It knows how to make common pizza types
 * This makes it even easier for customers to order popular pizzas
 */

public class PizzaDirector {

    // Method to make a classic Margherita pizza
    public Pizza makeMargherita(String size) {
        return new PizzaBuilder("Margherita", size, "Thin")
                .addCheese()
                .build();
    }

    // Method to make a Supreme pizza with all toppings
    public Pizza makeSupreme(String size) {
        return new PizzaBuilder("Supreme", size, "Thick")
                .addCheese()
                .addPepperoni()
                .addMushrooms()
                .addOlives()
                .build();
    }

    // Method to make a Pepperoni pizza
    public Pizza makePepperoni(String size) {
        return new PizzaBuilder("Pepperoni", size, "Regular")
                .addCheese()
                .addPepperoni()
                .build();
    }

    // Method to make a Veggie pizza
    public Pizza makeVeggieSpecial(String size) {
        return new PizzaBuilder("Veggie Special", size, "Whole Wheat")
                .addCheese()
                .addMushrooms()
                .addOlives()
                .build();
    }
}
