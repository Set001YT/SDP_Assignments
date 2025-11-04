package client;

import concrete_elements.*;
import concrete_visitors.*;

public class Main {
    public static void main(String[] args) {
        // create zoo
        Zoo zoo = new Zoo();

        // add animals
        zoo.addAnimal(new Lion("Simba", 5, 30));
        zoo.addAnimal(new Elephant("Dumbo", 12, 4500.5));
        zoo.addAnimal(new Monkey("George", 3, "Chimpanzee"));
        zoo.addAnimal(new Lion("Nala", 4, 0));
        zoo.addAnimal(new Monkey("Curious", 2, "Capuchin"));

        System.out.println("========== VETERINARIAN VISIT ==========");
        Veterinarian vet = new Veterinarian();
        zoo.acceptVisitor(vet);

        System.out.println("========== ZOOKEEPER FEEDING TIME ==========");
        Zookeeper keeper = new Zookeeper();
        zoo.acceptVisitor(keeper);

        System.out.println("========== STATISTICIAN DATA COLLECTION ==========");
        Statistician stats = new Statistician();
        zoo.acceptVisitor(stats);
        stats.printReport();
    }
}
