package com.javaguru.practices.practice_10;

import java.util.ArrayList;
import java.util.List;

class MonsterGenerator {


    List<Attacker> filterAttackers(List<NPC> npcs) {
        List<Attacker> attackers = new ArrayList<>();
        for (NPC npc : npcs) {
            if (npc instanceof Attacker) {
                attackers.add((Attacker) npc);
            }
        }
        return attackers;
    }
}
