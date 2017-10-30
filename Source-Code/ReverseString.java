/**
 *
 * @author LazPremarathna
 * @date 2017.07.24
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        String inputString;
        int inputStringLen;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inputString = scanner.next();
        inputStringLen = inputString.length();

        System.out.print("The reverse of the String " + inputString + " is ");
        for (int i = inputStringLen - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }
        scanner.close();
    }
}
