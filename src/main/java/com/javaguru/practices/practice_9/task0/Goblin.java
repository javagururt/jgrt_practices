package com.javaguru.practices.practice_9.task0;

import java.util.Random;

class Goblin extends NPC implements Attacker {

    private static Random RANDOM_GENERATOR = new Random();

    public Goblin() {
        super(RANDOM_GENERATOR.nextInt(201) + 100);
    }

    @Override
    public void attack() {

    }
}
