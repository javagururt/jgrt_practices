package com.javaguru.practices.practice_7.task3;

import java.util.Map;

class UniqueWordsVocabulary {

    private Map<String, Integer> uniqueWordsWithCount;

    public UniqueWordsVocabulary(Map<String, Integer> uniqueWordsWithCount) {
        this.uniqueWordsWithCount = uniqueWordsWithCount;
    }

    public Map<String, Integer> getUniqueWordsWithCount() {
        return uniqueWordsWithCount;
    }

    void addWord(String word) {
        if (uniqueWordsWithCount.containsKey(word)) {
            int count = uniqueWordsWithCount.get(word);
            uniqueWordsWithCount.put(word, ++count);
        } else {
            uniqueWordsWithCount.put(word, 0);
        }
    }
}
