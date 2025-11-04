package interfaces;

// base interface for all animals
public interface Animal {
    void accept(ZooVisitor visitor);
    String getName();
    int getAge();
}
