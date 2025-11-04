package concrete_elements;

import interfaces.*;

public class Lion implements Animal {
    private String name;
    private int age;
    private int maneLength;

    public Lion(String name, int age, int maneLength) {
        this.name = name;
        this.age = age;
        this.maneLength = maneLength;
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

    public int getManeLength() {
        return maneLength;
    }
}
