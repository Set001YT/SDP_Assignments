package concrete_visitors;

import interfaces.ZooVisitor;
import concrete_elements.*;

// zookeeper feeds animals
public class Zookeeper implements ZooVisitor {

    @Override
    public void visit(Lion lion) {
        System.out.println("Zookeeper: Feeding " + lion.getName() + " the Lion");
        System.out.println("  - Meal: 10 kg of fresh meat");
        System.out.println("  - Special note: Feed away from other animals");
        System.out.println();
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Zookeeper: Feeding " + elephant.getName() + " the Elephant");
        System.out.println("  - Meal: 150 kg of hay and fruits");
        System.out.println("  - Special note: Provide fresh water bath after meal");
        System.out.println();
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Zookeeper: Feeding " + monkey.getName() + " the Monkey");
        System.out.println("  - Meal: Bananas, nuts, and vegetables");
        System.out.println("  - Special note: Hide some food for enrichment activity");
        System.out.println();
    }
}
