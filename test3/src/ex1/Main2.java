/*
 * Copyright (c)  10.04.2023, 14:55  Alexey Kozadaev
 */

package ex1;


public class Main2 {
    public static void main(String[] args) {
        Cat cat1;
        cat1 = new Cat(3, "Murka", false);
        cat1.about();

        Cat cat2 = new Cat(5, "Tom", true);
        cat2.about();

        Cat cat3 = new Cat();
    }
}
