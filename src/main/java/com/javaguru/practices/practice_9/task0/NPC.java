package com.javaguru.practices.practice_9.task0;

abstract class NPC {

    private int healthPoints;

    public NPC(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
