
/**
 *
 * @author LazPremarathna
 * @date 2017.07.18
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
public class PrintNumberInWordSwitchCase {
    //attributes
    protected int number;
    //behaviours
    //initialize getters & setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        System.out.println("Number: " + number);
        if (number > 10) {
            this.number = 10;   //if the number is greater than 10, automatically assign the variable "number" as 10
        } else if (number < 1) {
            this.number = 1;    //if the number is lower than 1, automatically assign the variable "number" as 1
        } else {
            this.number = number;
        }
    }
    //end of getters & setters

    //use switch case
    public void printNumberInWord() {
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 10:
                System.out.println("TEN");
                break;
            default:
                break;
        }
    }
    //main method
    public static void main(String[] args) {
        //create an object
        PrintNumberInWordSwitchCase PWSC = new PrintNumberInWordSwitchCase();

        PWSC.setNumber(5);
        PWSC.printNumberInWord();
        System.out.print("\n");

        PWSC.setNumber(9);
        PWSC.printNumberInWord();
        System.out.print("\n");

        PWSC.setNumber(40);
        PWSC.printNumberInWord();
        System.out.print("\n");

        PWSC.setNumber(0);
        PWSC.printNumberInWord();
    }
}
