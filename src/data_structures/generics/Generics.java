package data_structures.generics;

import java.lang.reflect.Method;

class Printer {
    public void printArray(Object[] array) {
        if (array instanceof Integer[]) {
            Integer[] intArray = (Integer[]) array;
            for (Integer X: intArray) {
                System.out.println(X);
            }
        }

        else if (array instanceof String[]) {
            String[] stringArray = (String[]) array;
            for (String X: stringArray) {
                System.out.println(X);
            }
        }
    }
}

public class Generics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1)
            System.out.println("Method overloading is not allowed!");

    }
}
