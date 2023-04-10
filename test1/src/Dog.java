
/*
 * Copyright (c)  10.04.2023, 13:14  Alexey Kozadaev
 */

public class Dog {
    public static void main(String[] args) {
        String s;
        s = aport("Косточка", 20);
        System.out.println(s);
    }

    static String aport(String it, int amount) {
        String result;
        result = "Пожёванная " + it + ", количество " + amount;
        return result; // поместить в стек
    }
}
