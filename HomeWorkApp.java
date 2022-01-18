package ru.geekbrains.lesson1;
    //** Java 1 Homework 2
    //* @author Rozhkov
    //*@version 16.01.2022
public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Результат: " + within10and20(6, 3));
        isPositiveOrNegative(-9);
        System.out.println("Результат: " + positiveNegative(-7));
        printWord("yes", 5);
    }


    static boolean within10and20(int numberOne, int numberTwo)
    {
        return numberOne + numberTwo >= 10 && numberOne + numberTwo <= 20;

    }

    static void isPositiveOrNegative(int number)
    {
        System.out.println( number >= 0? "Positive" : "Negative");

    }

    static boolean positiveNegative(int number)
    {
        return number >= 0;

    }

    static void printWord(String word, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }



}