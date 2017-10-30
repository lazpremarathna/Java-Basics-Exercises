
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Laz
 */
public class GradesStatistics {

    public static int numOfStudent;
    public static int total;
    public static int[] grades;
    public static int[] sortedArray;

    public static void main(String[] args) {
        createArray();
        printArray(grades);
        calculateTotal(grades);
        calculateAvg();
        sortArray(grades);
        printArray(sortedArray);
        calculateMedian(sortedArray);
        System.out.println("The minimum is: " + sortedArray[0]);
        System.out.println("The maximum is: " + sortedArray[sortedArray.length - 1]);
    }

    public static void createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numOfStudent = scanner.nextInt();

        grades = new int[numOfStudent];
        for (int i = 0; i < numOfStudent; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
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

    public static int calculateTotal(int[] array) {
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }

    public static void calculateAvg() {
        double average;
        average = total / (double) numOfStudent;
        System.out.println("The average is: " + average);
    }

    public static int[] sortArray(int[] nonSortedArray) {
        //{ 50, 51, 56, 53 }
        sortedArray = new int[nonSortedArray.length];
        int temp;
        for (int i = 0; i < nonSortedArray.length - 1; i++) {
            for (int j = i + 1; j < nonSortedArray.length; j++) {
                if (nonSortedArray[i] > nonSortedArray[j]) {
                    temp = nonSortedArray[i];
                    nonSortedArray[i] = nonSortedArray[j];
                    nonSortedArray[j] = temp;
                    sortedArray = nonSortedArray;
                }
            }
        }
        return sortedArray;
    }
    
    public static void calculateMedian(int[] sortedArray) {
        double median = 0;
        int n;
        if (sortedArray.length%2 == 0) {
            n = sortedArray.length/2 - 1;
            median = (sortedArray[n] + sortedArray[n+1])/2;
        } else {
            n = sortedArray.length/2;
            median = sortedArray[n];
        }
        System.out.println("The median is: " + median);
    }
}