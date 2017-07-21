/**
 *
 * @author LazPremarathna
 * @date 2017.07.18
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 *      This program prints "Odd Number" if the int variable "number" is odd, or "Even Number" otherwise. The program shall always print "BYE!"" before exiting.
 */
public class CheckOddEven {
    //attributes
    protected int number;

    //behaviours
    //initialize getters & setters
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    //end of getters & setters

    //check odd or even status
    public void checkOddEven() {
        System.out.println("Number: " + getNumber());
        if(number % 2 == 0) {
            System.out.println("EVEN NUMBER");
        }else {
            System.out.println("ODD NUMBER");
        }
        System.out.println("--BYE--");
    }
    //main method
    public static void main(String[] args) {
        //create an object
        CheckOddEven COE = new CheckOddEven();

        COE.setNumber(8);
        COE.checkOddEven();
    }
}
