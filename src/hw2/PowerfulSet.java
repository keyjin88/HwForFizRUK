package src.hw2;

import java.util.HashSet;
import java.util.Set;


public class PowerfulSet {
    /**
     * Возвращает пересечение двух наборов. Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {1, 2}
     */
    public <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    /**
     * Возвращает объединение двух наборов. Пример: set1 = {1, 2, 3}, set2 = {0, 1, 2, 4}. Вернуть {0, 1, 2, 3, 4}
     */
    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    /**
     * Возвращает элементы первого набора без тех, которые находятся также и во втором наборе. Пример: set1 = {1, 2, 3},
     * set2 = {0, 1, 2, 4}. Вернуть {3}
     */
    public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) {
        Set<T> relativeComplement = new HashSet<>(set1);
        relativeComplement.removeAll(set2);
        return relativeComplement;
    }
}

