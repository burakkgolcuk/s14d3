package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "Mitsubishi: engine roaring to life";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "Mitsubishi: picking up speed";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "Mitsubishi: applying brakes";
    }
}
