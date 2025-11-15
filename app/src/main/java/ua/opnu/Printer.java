package ua.opnu;


public class Printer {
    public <E> void printArray(E[] array) {
        for (E e : array) {
            System.out.println(e);
        }
    }
}