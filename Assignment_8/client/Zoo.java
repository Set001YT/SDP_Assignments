package client;

import interfaces.*;
import java.util.ArrayList;
import java.util.List;

// zoo contains animals and accepts visitors
public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void acceptVisitor(ZooVisitor visitor) {
        for (Animal animal : animals) {
            animal.accept(visitor);
        }
    }
}
