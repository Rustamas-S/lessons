package edu.Rustamas.Lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//9
        int x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        x = in.nextInt();
        System.out.println("Input the second number: ");
        y = in.nextInt();
        z = x;
        x = y;
        y = z;
        System.out.println("Swapped values are: " + x + " and " + y);

//10
        int A = 10;
        int B = 5;
        if (A > B) {
            System.out.println("A is greater then B. " + "It's " + (A > B));
        } else {
            System.out.println("A is not greater then B. " + "It's " + (A > B));
        }

//11
        int year = 2000;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " Is Leap Year.");
        } else {
            System.out.println(year + " Is Not Leap Year.");
        }

//12
        int[] inputArray = {1, 5, 7, 2, 3, 6, 9, 10, 0, 10, 10, 11, 10, 5, 1, 5, 1, 0, -5, -21, 1, 0, 0, 3, -3, 3, -20};
        int smallest = inputArray[0];
        int secondSmallest = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < smallest) {
                secondSmallest = smallest;
                smallest = inputArray[i];
            } else if (inputArray[i] > smallest && inputArray[i] < secondSmallest) {
                secondSmallest = inputArray[i];
            }
        }
        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("The Smallest Element Is: " + smallest);
        System.out.println("Second The Smallest Element Is: " + secondSmallest);
    }
}

//        BANDYMAS atlikti 12 užduotį kitaip
//        int[] array = {1, 5, 7, 2, 3, 6, 9, 10, 0, 10, 10, 11, 10, 5, 1, 5, 1, 0, -5, -21, 1, 0, 0, 3, -3, 3, -20};
//        int minValue = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < minValue) {
//                minValue = array[i];
//            }
//        }
//        System.out.println(minValue);