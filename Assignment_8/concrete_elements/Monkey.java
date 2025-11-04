package concrete_elements;

import interfaces.*;

public class Monkey implements Animal {
    private String name;
    private int age;
    private String species;

    public Monkey(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }
}
