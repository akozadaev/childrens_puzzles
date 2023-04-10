/*
 * Copyright (c)  10.04.2023, 13:15  Alexey Kozadaev
 */

// однострочный коментарий

/* многострочный
комментарий
 */


public class Kitchen {

    // psvm + Tab
    public static void main(String[] args) {
        System.out.println("main");
        cookBreakfast();
        cookSoup();
    }

    static void cookSoup() {
        // sout + Tab
        // Ctrl-D дублирование строки
        System.out.println("Boil water");
        System.out.println("...");
        System.out.println("done");
    }

    static void cookBreakfast() {
        System.out.println("Breakfast done");
    }
}