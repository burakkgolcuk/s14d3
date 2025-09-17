package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() { return cylinders; }
    public String getName() { return name; }

    public String startEngine() { System.out.println(getClass().getSimpleName()); return "the car's engine is starting"; }
    public String accelerate()  { System.out.println(getClass().getSimpleName()); return "the car is accelerating"; }
    public String brake()       { System.out.println(getClass().getSimpleName()); return "the car is braking"; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car c)) return false;
        return cylinders == c.cylinders && Objects.equals(name, c.name);
    }
    @Override public int hashCode() { return Objects.hash(cylinders, name); }
}
