package com.sopra;

public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }
    public Plant() {
        name = null;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "I'm a plant, my name is " + name;
    }
}