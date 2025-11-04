package concrete_elements;

import interfaces.*;

public class Elephant implements Animal {
    private String name;
    private int age;
    private double weight;

    public Elephant(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void accept(ZooVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
