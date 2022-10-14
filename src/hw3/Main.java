package src.hw3;

import src.hw3.annotation.IsLike;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        checkIsLikeAnnotation(Post.class);
        printerReflectionCall();
        printParentsInterfaces(ArrayList.class);
    }

    /**
     * Написать метод, который рефлексивно проверит наличие аннотации @IsLike на любом переданном классе и выведет
     * значение, хранящееся в аннотации, на экран
     */
    public static void checkIsLikeAnnotation(Class<?> clazz) {
        System.out.println("Class Name:" + clazz.getSimpleName());

        System.out.println("--- annotations:");
        var annotation = clazz.getAnnotation(IsLike.class);
        if (annotation != null) {
            System.out.println("IsLike value: " + annotation.value());
        } else {
            System.out.println("Annotation IsLike not found");
        }
    }

    /**
     * Задача: с помощью рефлексии вызвать метод print() и обработать все возможные ошибки (в качестве аргумента
     * передавать любое подходящее число). При “ловле” исключений выводить на экран краткое описание ошибки.
     */
    public static void printerReflectionCall() {
        try {
            Class<APrinter> clazz = APrinter.class;
            System.out.println("Class Name:" + clazz.getSimpleName());

            var method = clazz.getDeclaredMethod("print", int.class);
            System.out.println("--- execution:");
            method.invoke(new APrinter(), 42);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    /**
     * Написать метод, который с помощью рефлексии получит все интерфейсы класса, включая интерфейсы от
     * классов-родителей и интерфейсов-родителей
     */
    private static void printParentsInterfaces(Class<?> clazz) {
        while (clazz != null) {
            System.out.println("Class: " + clazz.getName());
            var interfaces = clazz.getInterfaces();
            if (clazz.getSuperclass() != null) {
                System.out.println("Interfaces: ");
                Arrays.stream(interfaces).forEach(aClass -> System.out.println(aClass.getName()));
                System.out.println();
            }
            clazz = clazz.getSuperclass();
        }
        System.out.println();
    }
}
