
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
public class OddTest {

    public static boolean isOdd;
    public static boolean isContain8;

    public static void main(String[] args) {
        int inputNumber;
        System.out.print("Press '0' to EXIT\n");

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            inputNumber = in.nextInt();
            isOdd(inputNumber);
            if (isOdd == true) {
                System.out.println("ODD Number");
            } else {
                System.out.println("EVEN Number");
            }
            hasEight(inputNumber);
        } while (inputNumber != 0);

    }

    public static boolean isOdd(int number) {
        if (number % 2 == 0) {
            isOdd = false;
        } else {
            isOdd = true;
        }
        return isOdd;
    }

    public static boolean hasEight(int number) {
        String numberPha = Integer.toString(number);
        for (int i = 0; i < numberPha.length(); i++) {
            if (numberPha.charAt(i) == '8') {
                System.out.println("Number contains the digit 8");
                isContain8 = true;
                break;
            }
        }
        return isContain8;
    }
}
