/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laz
 */
public class PrintArray {

    public static int[] intArray = {5, 6, 55, 89, 77, 16, 1};
    public static int[] intArray1 = {5, 6, 55, 89, 77, 16, 1};
    public static int[] intArray2 = {5, 6, 55, 89, 74, 16, 1};
    public static boolean isContains;
    public static boolean isEqual;
    public static int key;

    public static void main(String[] args) {
        printArray(intArray);
        reverse(intArray);
        printArray(intArray1);
        printArray(intArray2);
        contains(intArray, 55);

        if (isContains == true) {
            System.out.println("\nKey Value " + key + " is contain");
        } else {
            System.out.println("\nKey Value " + key + " is not contain");
        }

        equals(intArray1, intArray2);

        if (isEqual == true) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(" }\n");
    }

    public static void reverse(int[] array) {
        System.out.print("{ ");
        for (int i = array.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(" }\n");
    }

    public static boolean contains(int[] array, int key) {
        PrintArray.key = key;
        for (int j = 0; j < array.length; j++) {
            if (key == array[j]) {
                isContains = true;
            }
        }
        return isContains;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    isEqual = true;
                    //continue;
                } else {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }
        return isEqual;
    }
}
