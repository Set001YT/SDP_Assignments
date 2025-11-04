package concrete_visitors;

import interfaces.ZooVisitor;
import concrete_elements.*;

// statistician collects data about animals
public class Statistician implements ZooVisitor {
    private int totalAnimals;
    private int totalAge;

    public Statistician() {
        this.totalAnimals = 0;
        this.totalAge = 0;
    }

    @Override
    public void visit(Lion lion) {
        totalAnimals++;
        totalAge += lion.getAge();
        System.out.println("Statistician: Recording data for " + lion.getName());
        System.out.println("  - Type: Lion");
        System.out.println("  - Age recorded: " + lion.getAge() + " years");
        System.out.println();
    }

    @Override
    public void visit(Elephant elephant) {
        totalAnimals++;
        totalAge += elephant.getAge();
        System.out.println("Statistician: Recording data for " + elephant.getName());
        System.out.println("  - Type: Elephant");
        System.out.println("  - Age recorded: " + elephant.getAge() + " years");
        System.out.println();
    }

    @Override
    public void visit(Monkey monkey) {
        totalAnimals++;
        totalAge += monkey.getAge();
        System.out.println("Statistician: Recording data for " + monkey.getName());
        System.out.println("  - Type: Monkey");
        System.out.println("  - Age recorded: " + monkey.getAge() + " years");
        System.out.println();
    }

    public void printReport() {
        System.out.println("=== STATISTICAL REPORT ===");
        System.out.println("Total animals checked: " + totalAnimals);
        if (totalAnimals > 0) {
            double averageAge = (double) totalAge / totalAnimals;
            System.out.println("Average age: " + String.format("%.1f", averageAge) + " years");
        }
        System.out.println("==========================");
        System.out.println();
    }
}
