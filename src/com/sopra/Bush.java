package com.sopra;
/*
public class Bush extends Plant {
    private boolean flowered;

    public Bush() {
    }
    public Bush(boolean flowered) {
        this.flowered = flowered;
    }
    public boolean isFlowered() {
        return flowered;
    }
    public void setFlowered(boolean flowered) {
        this.flowered = flowered;
    }
}
*/
/*
public class Bush extends Plant {
    private boolean flowered;

    public Bush() {
    }
    public Bush(boolean flowered) {
        this.flowered = flowered;
    }
    public boolean isFlowered() {
        return flowered;
    }
    public void setFlowered(boolean flowered) {
        this.flowered = flowered;
    }
    @Override
    public String toString() {
        return "I'm a bush, my name is " + getName();
    }
}
*/

public class Bush extends Plant implements LivingBeing {
    private boolean flowered;

    public Bush() {
    }
    public Bush(boolean flowered) {
        this.flowered = flowered;
    }
    public boolean isFlowered() {
        return flowered;
    }
    public void setFlowered(boolean flowered) {
        this.flowered = flowered;
    }
    @Override
    public String toString() {
        return "I'm a bush, my name is " + getName();
    }
    @Override
    public String grow() {
        return "I'm a growing bush";
    }
    @Override
    public String perish() {
        return "I'm a dying bush";
    }
}
