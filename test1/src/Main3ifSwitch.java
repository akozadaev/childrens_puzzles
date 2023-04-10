
/*
 * Copyright (c)  10.04.2023, 13:15  Alexey Kozadaev
 */

public class Main3ifSwitch {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//Преверка услович
        if (a > b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
//Тернарный оператор
        System.out.println((a > b) ? "True": "False");
// Оператор выбора
        int grade = 50;
        switch (grade) {
            case 5:
                System.out.println("Best");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Norm");
                break;
            case 2:
                System.out.println("Bad");
                break;
            default:
                System.out.println("out of range");
        }


    }
}
