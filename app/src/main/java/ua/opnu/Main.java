package ua.opnu;


import java.util.Arrays;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        // Завдання 1
        System.out.println("=== MyOptional tests ===");
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println(middleName); // MyOptional[empty]
        System.out.println("isPresent: " + middleName.isPresent()); // false
        System.out.println("orElse: " + middleName.orElse("немає")); // "немає"


        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println(username); // MyOptional[value=admin]
        System.out.println("isPresent: " + username.isPresent()); // true
        System.out.println("get(): " + username.get()); // "admin"
        System.out.println("orElse: " + username.orElse("guest")); // "admin"


        try {
            String test = middleName.get();
            System.out.println("unexpected: " + test);
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток: " + ex.getMessage());
        }


        try {
            MyOptional<String> broken = new MyOptional<>(null);
            System.out.println("unexpected: " + broken);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }


        // Завдання 2
        System.out.println("\n=== BookData tests ===");
        BookData b1 = new BookData("A Tale", "Author1", 10, 45.0); // rating 4.5
        BookData b2 = new BookData("Zebra", "Author2", 5, 20.0); // rating 4.0
        BookData b3 = new BookData("B Story", "Author3", 0, 0.0); // rating 0.0
        BookData[] books = { b1, b2, b3 };
        Arrays.sort(books);
        for (BookData b : books) System.out.println(b);


        // Завдання 3
        System.out.println("\n=== Printer tests ===");
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);


        // Завдання 4
        System.out.println("\n=== filter tests ===");
        Integer[] nums = {1,2,3,4,5,6};
        Predicate<Integer> even = (n) -> n % 2 == 0;
        Integer[] evens = Utils.filter(nums, even);
        System.out.println(Arrays.toString(evens));


        // Завдання 5
        System.out.println("\n=== contains tests ===");
        Integer[] arr = {1,2,3};
        boolean c1 = Utils.contains(arr, 2);
        boolean c2 = Utils.contains(arr, 5);
        System.out.println("contains 2: " + c1 + ", contains 5: " + c2);


        // Завдання 6
        System.out.println("\n=== tuple tests ===");
        GenericTwoTuple<String, Integer> t2 = new GenericTwoTuple<>("Ivanov", 95);
        System.out.println(t2);


        GenericThreeTuple<String, Integer, Double> t3 = new GenericThreeTuple<>("Petro", 80, 4.5);
        System.out.println(t3);
    }
}