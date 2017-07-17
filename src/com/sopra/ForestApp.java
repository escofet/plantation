package com.sopra;

import java.awt.Color;
import java.util.ArrayList;

public class ForestApp {
    public static void main(String[] args) {
        // Un objeto PTree
        PTree firstTree = new PTree(20, 10, 8, Color.green);
        firstTree.setName("Abeto");
        System.out.println(String.format("Tree name %s", firstTree.getName()));
        System.out.println(String.format("Tree data %s", firstTree));
        System.out.println(String.format("I'm a %s, also a %s",
                firstTree.getClass().getSimpleName(),
                firstTree.getClass().getSuperclass().getSimpleName()));

        Bush firstBush = new Bush(true);
        firstBush.setName("Rosebush");
        System.out.println(String.format("Tree name %s", firstBush.getName()));
        System.out.println(String.format("Tree data %s", firstBush));
        System.out.println(String.format("I'm a %s, also a %s", firstBush.getClass().getSimpleName(), firstBush.getClass().getSuperclass().getSimpleName()));


        ArrayList<Plant> vivarium = new ArrayList<>();
        vivarium.add(firstTree);
        vivarium.add(firstBush);
        System.out.println(String.format("First data %s", vivarium.get(0)));
        System.out.println(String.format("Second data %s", vivarium.get(1)));


        System.out.println(firstBush.perish());
        System.out.println(String.format("%s: %s", firstBush.perish(), firstBush.feed()));

    }
}