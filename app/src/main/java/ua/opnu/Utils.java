package ua.opnu;


import java.util.Arrays;
import java.util.function.Predicate;


public class Utils {


    // Завдання 4: узагальнений filter
    public static <T> T[] filter(T[] input, Predicate<T> p) {
        if (input == null) return null;
        T[] result = Arrays.copyOf(input, input.length); // збережемо тип T[]
        int counter = 0;
        for (T t : input) {
            if (p.test(t)) {
                result[counter++] = t;
            }
        }
        return Arrays.copyOf(result, counter);
    }


    // Завдання 5: узагальнений contains
    public static <T extends Comparable<? super T>, V extends T> boolean contains(T[] array, V element) {
        if (array == null) return false;
        for (T t : array) {
            if (t.compareTo(element) == 0) return true;
        }
        return false;
    }
}