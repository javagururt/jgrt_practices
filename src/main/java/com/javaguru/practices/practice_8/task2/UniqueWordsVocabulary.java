package com.javaguru.practices.practice_8.task2;

import java.util.Map;

/**
 * Необходимо создать коллекцию уникальных слов, в которой
 * в которой будут слова и количество повторений слов
 * <p>
 * Например, если слово "Hello" было добавлено 3 раза, слово "World" 5 раз,
 * то результатом работы должен быть результат: Hello - 3, World - 5 (Вывод в консоль может отличаться)
 */
class UniqueWordsVocabulary {

    /*
    Необходимо создать поле класса, которое будет являться хранилишем
    слов (т.е куда будут записываться слова и количество повторений)
     */
    private Map<String, Integer> uniqueWordsWithCount;

    /*
    Необходимо дополнить метод getUniqueWordsWithCount таким образом,
    чтобы он возвращал текущую коллекцию класса UniqueWordsVocabulary
     */
    public Map<String, Integer> getUniqueWordsWithCount() {
        return uniqueWordsWithCount;
    }

    /*
    Необходимо дополнить метод addWord таким образом, чтобы при вызове данного метода
    в созданную ранее коллекцию добавлялись слов. В случае повторений - увеличивался счетчик
     */
    void addWord(String word) {
        if (uniqueWordsWithCount.containsKey(word)) {
            int count = uniqueWordsWithCount.get(word);
            uniqueWordsWithCount.put(word, ++count);
        } else {
            uniqueWordsWithCount.put(word, 0);
        }
    }
}
