package SDP_Assignment_1;

/*
 * Demonstration(client) class showing how to use the Builder pattern
  This is like a customer ordering different pizzas
 */

public class PizzaOrderDemo {

    public static void main(String[] args) {
        System.out.println("Welcome to the Pizza Shop!");

        // Show different ways to order pizza
        demonstrateBasicBuilder();
        demonstrateAdvancedBuilder();
        demonstrateDirector();
        demonstrateErrorHandling();
    }

    /*
     * Basic way to build a pizza step by step
     */

    private static void demonstrateBasicBuilder() {
        System.out.println("=== Basic Pizza Building ===");

        // Build a simple cheese pizza using separate PizzaBuilder
        Pizza cheesePizza = new PizzaBuilder("Cheese Special", "Medium", "Thin")
                .addCheese()
                .build();

        System.out.println(cheesePizza);
        System.out.println();
    }

    /*
     * Advanced way showing method chaining and customization
     */

    private static void demonstrateAdvancedBuilder() {
        System.out.println("=== Advanced Pizza Building ===");

        // Build a custom pizza with multiple toppings
        Pizza customPizza = new PizzaBuilder("My Special Pizza", "Large", "Stuffed Crust")
                .addCheese()
                .addPepperoni()
                .addMushrooms()
                .build();

        System.out.println(customPizza);

        // Build a pizza without cheese (vegan option)
        Pizza veganPizza = new PizzaBuilder("Vegan Delight", "Small", "Thin")
                .removeCheese()  // Remove the default cheese
                .addMushrooms()
                .addOlives()
                .build();

        System.out.println(veganPizza);
        System.out.println();
    }

    /*
     * Using the Director for common pizza types
     */

    private static void demonstrateDirector() {
        System.out.println("=== Using Pizza Director (Popular Orders) ===");

        PizzaDirector director = new PizzaDirector();

        // Easy way to order popular pizzas
        Pizza margherita = director.makeMargherita("Medium");
        Pizza supreme = director.makeSupreme("Large");
        Pizza pepperoni = director.makePepperoni("Small");
        Pizza veggie = director.makeVeggieSpecial("Medium");

        System.out.println(margherita);
        System.out.println(supreme);
        System.out.println(pepperoni);
        System.out.println(veggie);
    }

    /*
     * Show how the code handles errors (Clean Code: proper error handling)
     */

    private static void demonstrateErrorHandling() {
        System.out.println("=== Error Handling Examples ===");

        // Example 1: Try to create pizza with empty name
        try {
            new PizzaBuilder("", "Medium", "Thin").build();
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }

        // Example 2: Try to create pizza with no toppings
        try {
            new PizzaBuilder("Sad Pizza", "Large", "Thick")
                    .removeCheese()  // Remove the default cheese
                    .build();        // This will fail - no toppings!
        } catch (IllegalStateException e) {
            System.out.println("Error caught: " + e.getMessage());
        }

        System.out.println("All examples completed successfully!");
    }
}