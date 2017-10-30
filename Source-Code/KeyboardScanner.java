/**
 *
 * @author LazPremarathna
 * @date 2017.07.24
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
import java.util.Scanner;
public class KeyboardScanner {
    public static void main(String[] args) {
        int num1;
        double num2;
        String name;
        double sum;

        // Setup a Scanner called in to scan the keyboard (System.in)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num1 = scanner.nextInt();       // use nextInt() to read int

        System.out.print("Enter a floating point number: ");
        num2 = scanner.nextDouble();    // use nextInt() to read int

        System.out.print("Enter your name: ");
        name = scanner.next();           // use next() to read String

        // Display
        sum = (double)num1 + num2;
        System.out.println("Hi! " + name + ", the sum of " + num1 + " and " + num2 + " is " + sum);
        // Close the input stream
        scanner.close();
    }
}
