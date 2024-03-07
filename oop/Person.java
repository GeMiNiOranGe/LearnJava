package oop;

public class Person {
    private String name;
    private int age;
    private float height;

    public Person() {
    }

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Person clone() {
        Person copy = new Person(this.name, this.age, this.height);
        return copy;
    }

    public String getInfo() {
        return String.format("name = %s, age = %d, height = %.2f", this.name, this.age, this.height);
    }
}
