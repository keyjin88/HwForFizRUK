package src.hw4;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    /**
     * Посчитать сумму четных чисел в промежутке от 1 до 100 включительно и вывести ее на экран.
     */
    public static void sum() {
        var summ = IntStream.rangeClosed(1, 100).sum();
        System.out.println(summ);
    }

    /**
     * На вход подается список целых чисел. Необходимо вывести результат перемножения этих чисел. Например, если на вход
     * передали List.of(1, 2, 3, 4, 5), то результатом должно быть число 120 (т.к. 1 * 2 * 3 * 4 * 5 = 120).
     * @param integers
     * @return
     */
    public static int multiply(List<Integer> integers) {
        return integers.stream()
                .reduce((i1, i2) -> i1 * i2).get();
    }

    /**
     * На вход подается список строк. Необходимо вывести количество непустых строк в списке. Например, для
     * List.of("abc", "", "", "def", "qqq") результат равен 3.
     */
    public static long countEmptyStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() > 0)
                .count();
    }

    /**
     * На вход подается список вещественных чисел. Необходимо отсортировать их по убыванию.
     */
    public static List<Double> sortDoublesList(List<Double> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    /**
     * На вход подается список непустых строк. Необходимо привести все символы строк к верхнему регистру и вывести их,
     * разделяя запятой. Например, для List.of("abc", "def", "qqq") результат будет ABC, DEF, QQQ.
     */
    public static List<String> capitalizeStrings(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

    public static Set<Integer> convertToFlatSet(Set<Set<Integer>> sets) {
        return sets.stream()
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
    }
}


