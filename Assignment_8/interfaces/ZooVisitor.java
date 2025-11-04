package interfaces;

import concrete_elements.*;

// visitor interface with visit methods for each animal type
public interface ZooVisitor {
    void visit(Lion lion);
    void visit(Elephant elephant);
    void visit(Monkey monkey);
}
