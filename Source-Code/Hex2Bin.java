
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
public class Hex2Bin {

    public static void main(String[] args) {
        String inputString;
        int inputStringLen;
        String[] hexBits = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        inputString = in.next().toLowerCase();
        inputStringLen = inputString.length();
        
        System.out.print("The equivalent binary for hexadecimal '" + inputString + "'" + " is: ");
        
        for (int i = 0; i < inputStringLen; i++) {
            switch (inputString.charAt(i)) {
                case '0':
                    System.out.print(hexBits[0] + " ");
                    break;
                case '1':
                    System.out.print(hexBits[1] + " ");
                    break;
                case '2':
                    System.out.print(hexBits[2] + " ");
                    break;
                case '3':
                    System.out.print(hexBits[3] + " ");
                    break;
                case '4':
                    System.out.print(hexBits[4] + " ");
                    break;
                case '5':
                    System.out.print(hexBits[5] + " ");
                    break;
                case '6':
                    System.out.print(hexBits[6] + " ");
                    break;
                case '7':
                    System.out.print(hexBits[7] + " ");
                    break;
                case '8':
                    System.out.print(hexBits[8] + " ");
                    break;
                case '9':
                    System.out.print(hexBits[9] + " ");
                    break;
                case 'a':
                    System.out.print(hexBits[10] + " ");
                    break;
                case 'b':
                    System.out.print(hexBits[11] + " ");
                    break;
                case 'c':
                    System.out.print(hexBits[12] + " ");
                    break;
                case 'd':
                    System.out.print(hexBits[13] + " ");
                    break;
                case 'e':
                    System.out.print(hexBits[14] + " ");
                    break;
                case 'f':
                    System.out.print(hexBits[15] + " ");
                    break;
                default:
                    System.out.print("Invalid" + " ");
                    break;
            }
        }
        
    }
}
