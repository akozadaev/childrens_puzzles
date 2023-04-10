/*
 * Copyright (c)  10.04.2023, 14:57  Alexey Kozadaev
 */

package ex3;


public class Horse {
    String name;
    int speed;
    String color;
    boolean isMale;
    int age;

    void eat() {
        about();
        System.out.println("eating...");
    }

    void about() {
        String sex = (isMale) ? "Male" : "Female"; // тернарный оператор
        System.out.printf("name: %s, age: %d, sex: %s\t\t", name, age, sex);
    }

    void ride() {
        about();
        System.out.println("riding at speed " + speed);
    }
}
