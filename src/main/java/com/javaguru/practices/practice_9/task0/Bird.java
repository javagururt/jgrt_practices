package com.javaguru.practices.practice_9.task0;

class Bird extends NPC implements Flyable {

    private static final int HEALTH_POINTS = 10;

    public Bird() {
        super(HEALTH_POINTS);
    }

    @Override
    public void fly() {

    }
}
