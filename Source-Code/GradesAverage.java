
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
public class GradesAverage {

    public static void main(String[] args) {
        int arraySize;
        int arrayInput;
        boolean inputValueCorrect = false;
        int total;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        arraySize = scanner.nextInt();

        int[] grades = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            label:
            do {
                System.out.print("Enter the grade for student " + (i + 1) + ":");
                arrayInput = scanner.nextInt();

                if (0 > arrayInput || arrayInput > 100) {
                    System.out.println("Invalid grade, try again...");
                    inputValueCorrect = false;
                    continue label;
                } else {
                    grades[i] = arrayInput;
                    inputValueCorrect = true;
                }
            } while (inputValueCorrect != true);
        }
        total = 0;
        for (int j = 0; j < arraySize; j++) {
            total = total + grades[j];
        }
        System.out.print("\n");
        System.out.println("The total is: " + total);
        average = total / (double) arraySize;
        System.out.println("The average is: " + average);
        scanner.close();
    }
}
