package com.sopra;
/*
Ptree hereda de Plant
*/

import java.awt.Color;

public class PTree extends Plant {
    private float height;
    private float circunference;
    private int foliageDensity;
    private Color treeTrunkColor;

    // Constructor vacío
    public PTree() {
        height = 30.0F;
        circunference = 0.0F;
        foliageDensity = 0;
        treeTrunkColor = Color.BLACK;
    }
    // Constructor parametrizado
    public PTree(float height, float circunference, int foliageDensity, Color treeTrunkColor) {
        if(height > 30) {
            this.height = 30F;
        } else {
            this.height = height;
        }
        // Otra forma más compacta
        // this.height = height < 30 ? 30 : height;
        this.circunference = circunference;
        this.foliageDensity = foliageDensity;
        this.treeTrunkColor = treeTrunkColor;
    }
    // Métodos de acceso
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getCircunference() {
        return circunference;
    }
    public void setCircunference(float circunference) {
        this.circunference = circunference;
    }
    public int getFoliageDensity() {
        return foliageDensity;
    }
    public void setFoliageDensity(int foliageDensity) {
        this.foliageDensity = foliageDensity;
    }
    public Color getTreeTrunkColor() {
        return treeTrunkColor;
    }
    public void setTreeTrunkColor(Color treeTrunkColor) {
        this.treeTrunkColor = treeTrunkColor;
    }
    public float getUnscaledTreeVolume() {
        return height * circunference * foliageDensity;
    }
    public float getScaledTreeVolume(float scale) {
        return height * circunference * foliageDensity * scale;
    }
}