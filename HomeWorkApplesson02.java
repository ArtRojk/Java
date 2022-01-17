package ru.geekbrains.lesson1;
    //** Java 1 Homework 2
    //* @author Rozhkov
    //*@version 16.01.2022
public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Результат: " + WithIn10And20(6, 3));
        isPositiveOrNegative(-9);
        System.out.println("Результат: " + PositiveNegative(-7));
        PrintWord("yes", 5);
    }


    static boolean WithIn10And20(int numberOne, int numberTwo)
    {
        int sum = numberOne + numberTwo;
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }

    static void isPositiveOrNegative(int number)
    {
            if (number >= 0)
                System.out.println("Positive");
            else
                System.out.println("Negative");
    }

    static boolean PositiveNegative(int number)
    {
        if (number >= 0)
            return true;
        else
            return false;
    }

    static void PrintWord(String word, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }



}