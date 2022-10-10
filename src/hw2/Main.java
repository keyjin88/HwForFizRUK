package src.hw2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    /**
     * 1. Реализовать метод, который на вход принимает ArrayList<T>, а возвращает набор уникальных элементов этого
     * массива. Решить используя коллекции.
     */
    public static HashSet<Object> setFromList(ArrayList<Object> input) {
        return new HashSet<>(input);
    }

    /**
     * 2. С консоли на вход подается две строки s и t. Необходимо вывести true, если одна строка является валидной
     * анаграммой другой строки и false иначе. Анаграмма — это слово или фраза, образованная путем перестановки букв
     * другого слова или фразы, обычно с использованием всех исходных букв ровно один раз.
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    private String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    /**
     * 4. В некоторой организации хранятся документы (см. класс Document). Сейчас все документы лежат в ArrayList, из-за
     * чего поиск по id документа выполняется неэффективно. Для оптимизации поиска по id, необходимо помочь сотрудникам
     * перевести хранение документов из ArrayList в HashMap.
     */
    public Map<Integer, Document> organizeDocuments(List<Document> documents) {
        return documents.stream()
                .collect(Collectors.toMap(document -> document.id, document -> document, (a, b) -> b));
    }


}
