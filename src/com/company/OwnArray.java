package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OwnArray {
    //массив размерности n. вывести min max
    public static int[] minAndMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }

    //сумма всех элемнтов двумерного массив
    public static int sum(int[][] arr) {
        int sum = 0;

        for (int[] row : arr) {
            for (int elem : row) {
                sum += elem;
            }
        }

        return sum;
    }

    //сумма всех элемнтов двумерного массив
    public static int sumList(int[][] arr) {
        int sum = 0;

        for (int[] row : arr) {
            for (int elem : row) {
                sum += elem;
            }
        }

        return sum;
    }

    //рандомный int массив из length элементов
    public static int[] rand(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (new Random()).nextInt();
        }

        return arr;
    }

    public static String[] randString(int length) {
//        String[] arr = new String[length];
//
//        for (int i = 0; i < length; i++) {
//            arr[i] = String.valueOf((new Random()).nextInt());
//        }

        return new String[]{"teSt", "double", "SometShing", "special", "s withs"};
    }

    public static String concat(String[] arr) {
        StringBuilder total = new StringBuilder();
        for (String elem : arr) {
            total.append(elem);
        }
        return total.toString();
    }

    public static String concatS(String[] arr) {
        StringBuilder total = new StringBuilder();
        for (String elem : arr) {
            if(elem.contains("S")) {
                elem = elem.replace("S", "V");
                total.append(elem);
            }
        }
        return total.toString();
    }

    //сортировка пузырьком
    public static void sortBubble(int[] arr) {
        int cycle = 0;
        boolean isSortTriggered = false;
        do {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSortTriggered = true;
                }
            }
            cycle++;

        } while (cycle < arr.length || !isSortTriggered);
    }

    public static UserNumber parseNumber(String number) throws Exception {
        Matcher m = Pattern.compile("(\\d{3})-(\\d{2})-(\\d{7})").matcher(number);
        if (m.matches()) {
            return new UserNumber(number, m);
        }
        throw new Exception();
    }
}
