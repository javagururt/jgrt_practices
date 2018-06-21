package com.javaguru.practices.practice_11;

import java.util.ArrayList;
import java.util.List;

class MatchboxImpl {

    private MatchboxState state;
    private List<Match> matches = new ArrayList<>();

    public MatchboxImpl(int matchCount) {
        for (int i = 0; i < matchCount; i++) {
            matches.add(new Match());
        }
        state = MatchboxState.CLOSED;
    }

    public boolean isEmpty() {
        return matches.isEmpty();
    }

    public void open() {
        state = MatchboxState.OPEN;
    }

    public void close() {
        state = MatchboxState.CLOSED;
    }

    public boolean isOpen() {
        return state == MatchboxState.OPEN;
    }

    public boolean isClosed() {
        return state == MatchboxState.CLOSED;
    }

    public Match getMatch() {
        if (isOpen() && !isEmpty()) {
            Match match = matches.get(0);
            matches.remove(match);
            return match;
        }
        return null;
    }

    public void addMatch(Match match) {
        if (match != null) {
            matches.add(match);
        }
    }

    public int countMatches() {
        return matches.size();
    }
}
