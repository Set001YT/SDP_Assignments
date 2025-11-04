package concrete_visitors;

import interfaces.ZooVisitor;
import concrete_elements.*;

// veterinarian performs health checks on animals
public class Veterinarian implements ZooVisitor {

    @Override
    public void visit(Lion lion) {
        System.out.println("Veterinarian: Checking " + lion.getName() + " the Lion");
        System.out.println("  - Age: " + lion.getAge() + " years");
        System.out.println("  - Mane length: " + lion.getManeLength() + " cm");
        System.out.println("  - Health status: Checking teeth and claws");
        System.out.println();
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Veterinarian: Checking " + elephant.getName() + " the Elephant");
        System.out.println("  - Age: " + elephant.getAge() + " years");
        System.out.println("  - Weight: " + elephant.getWeight() + " kg");
        System.out.println("  - Health status: Measuring trunk flexibility");
        System.out.println();
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Veterinarian: Checking " + monkey.getName() + " the Monkey");
        System.out.println("  - Age: " + monkey.getAge() + " years");
        System.out.println("  - Species: " + monkey.getSpecies());
        System.out.println("  - Health status: Checking for parasites");
        System.out.println();
    }
}
