package com.sopra;
/*
Primer proyecto y
estructura de un programa simple
*/

import java.awt.Color;

public class Mensaje {
    /*
    public static void main(String[] args) {
        // Crear un objeto árbol
        Tree myTree = new Tree(50, 10, 5, Color.GREEN);
        //Calcular volumen visible estimado
        float treeVolume = myTree.getCircunference() * myTree.getHeight() * 0.8F * myTree.getFoliageDensity();
        System.out.println("El volumen del �rbol es " + treeVolume + "cm3");
    }
    */
    /*
    private static final float DENSITY_FACTOR = 0.8F;
    public static void main(String[] args) {
        Tree myTree = new Tree(50, 10, 5, Color.GREEN);
        //Calcular volumen visible estimado
        float treeVolume = myTree.getCircunference() * myTree.getHeight() * DENSITY_FACTOR * myTree.getFoliageDensity();
        System.out.println("El volumen del �rbol es " + treeVolume + "cm3");
    }
    */

    private static final float DENSITY_FACTOR = 0.8F;
    public static void main(String[] args) {
        Tree myTree = new Tree(50, 10, 5, Color.GREEN);
        //Calcular volumen visible estimado
        float treeVolume = myTree.getUnscaledTreeVolume() * DENSITY_FACTOR;
        System.out.println("El volumen del árbol es " + treeVolume + "cm3");
        System.out.println("El volumen del árbol es " + myTree.getScaledTreeVolume(DENSITY_FACTOR) + "cm3");

        // Verificar en tiempo de ejecuci�n
        //assert treeVolume == myTree.getScaledTreeVolume(DENSITY_FACTOR) : "Error en definici�n de m�todo";
    }
    
}