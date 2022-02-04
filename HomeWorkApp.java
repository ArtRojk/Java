
package ru.geekbrains.lesson1.MainApp.java.Lesson03;

import java.util.Arrays;


//** Java 1 Homework 3
//* @author Rozhkov
//*@version 03.02.2022

class HomeWorkApp {

    public static void main(String[] args) {
        entry(5, 5);

        int[] arr1 = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++){
        arr1[i] = 1 - arr1[i];
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[100];
        arr2[0] = 0;
        System.out.println(Arrays.toString(arr2));
        for (int i = 1; i < arr2.length; i++){
        arr2[i] = i + 1;
        System.out.println(Arrays.toString(arr2));
        }

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
        if (arr3[i] < 6)
        arr3[i] *= 2;
        }
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++){
        arr4[i][i] = 1;
        arr4[i][arr4.length - i - 1] = 1;
        }
        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i < arr4.length; i++) {
        System.out.println(Arrays.toString(arr4[i]));
        }
        }

    static void entry(int len, int initialValue) {
        int arr5[] = new int[len];
        for (int i = 0; i < arr5.length; i++) {
        arr5[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr5));
    }
}














