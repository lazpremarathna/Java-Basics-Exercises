/**
 *
 * @author LazPremarathna
 * @date 2017.07.18
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
public class PrintNumberInWordNestedIf {
    //attributes
    protected int number;

    //behaviours
    //initialize getters & setters
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        System.out.println("Number: " + number);
        if(number>10) {
            this.number = 10;   //if the number is greater than 10, automatically assign the variable "number" as 10
        }else if(number<1) {
            this.number = 1;     //if the number is lower than 1, automatically assign the variable "number" as 1
        }else {
            this.number = number;
        }
    }
    //end of getters & setters

    //print numbers in word using nested-if
    public void printNumberInWord() {
        if(number == 1) {
            System.out.println("ONE");
        }else if(number == 2) {
            System.out.println("TWO");
        }else if(number == 3) {
            System.out.println("THREE");
        }else if(number == 4) {
            System.out.println("FOUR");
        }else if(number == 5) {
            System.out.println("FIVE");
        }else if(number == 6) {
            System.out.println("SIX");
        }else if(number == 7) {
            System.out.println("SEVEN");
        }else if(number == 8) {
            System.out.println("EIGHT");
        }else if(number == 9) {
            System.out.println("NINE");
        }else {
            System.out.println("TEN");
        }
    }
    //main method
    public static void main(String[] args) {
        //create an object
        PrintNumberInWordNestedIf PWN = new PrintNumberInWordNestedIf();

        PWN.setNumber(5);
        PWN.printNumberInWord();
        System.out.print("\n");

        PWN.setNumber(10);
        PWN.printNumberInWord();
        System.out.print("\n");

        PWN.setNumber(50);
        PWN.printNumberInWord();
        System.out.print("\n");

        PWN.setNumber(0);
        PWN.printNumberInWord();
    }
}
