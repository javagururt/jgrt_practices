package com.javaguru.practices.practice_10;

class Bomber extends NPC implements Attacker, Flyable {

    private static final int HEALTH_POINTS = 100;

    public Bomber() {
        super(HEALTH_POINTS);
    }

    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }
}