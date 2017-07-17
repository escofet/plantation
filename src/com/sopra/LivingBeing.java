package com.sopra;
/*
public interface LivingBeing {
    public String grow();
    public String perish();
}
*/

public interface LivingBeing {
    public String grow();
    public String perish();

    default String feed() {
        return "I need food";
    }
}