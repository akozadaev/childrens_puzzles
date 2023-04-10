/*
 * Copyright (c)  10.04.2023, 13:15  Alexey Kozadaev
 */

import java.util.Arrays;

public class Main5Array1 {
    public static void main(String[] args) {
        int a = 10;
        int[] numbers = {10, 3, 5, 22};
        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[3]);

//        numbers[3] = "hello";
        numbers[3] = 12;
//        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));

        // itar + Tab
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // iter + Tab
//        for (пробежать по массиву numbers, каждый раз сохраняя очердной элемент массива во
//        временную переменную number типа int)
        //foreach
        for (int number : numbers) {
            System.out.println(number);
        }

        for (String s : args) {
            System.out.println(s);
        }

//        numbers[100] = 10; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100

    }
}
