
/**
 *
 * @author LazPremarathna
 * @date 2017.07.24 find the exercise on
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
import java.util.Scanner;

public class CheckVowelsDigits {

    private String inputString;
    private int inputStringLen;
    private int numOfVowels;
    private double vowelPercentage;

    public String getInputString() {
        return inputString;
    }
    public void setInputString(String inputString) {
        this.inputString = inputString;
    }
    public int getInputStringLen() {
        return inputStringLen;
    }
    public void setInputStringLen() {
        inputStringLen = inputString.length();
    }
    public int getNumOfVowels() {
        return numOfVowels;
    }

    public int calculateVowels() {
        for (int i = 0; i <= inputStringLen - 1; i++) {
            if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A') {
                numOfVowels++;
            } else if (inputString.charAt(i) == 'e' || inputString.charAt(i) == 'E') {
                numOfVowels++;
            } else if (inputString.charAt(i) == 'i' || inputString.charAt(i) == 'I') {
                numOfVowels++;
            } else if (inputString.charAt(i) == 'o' || inputString.charAt(i) == 'O') {
                numOfVowels++;
            } else if (inputString.charAt(i) == 'u' || inputString.charAt(i) == 'U') {
                numOfVowels++;
            }
        }
        return numOfVowels;
    }

    public void printDetails() {
        vowelPercentage = (numOfVowels/(double)inputStringLen)*100;
        System.out.println("Number of vowels: " + getNumOfVowels() + " " + "(" + vowelPercentage + "%" + ")");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");

        CheckVowelsDigits CVD = new CheckVowelsDigits();
        CVD.setInputString(scanner.next());
        CVD.setInputStringLen();
        CVD.calculateVowels();
        CVD.printDetails();
    }
}
