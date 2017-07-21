/**
 *
 * @author LazPremarathna
 * @date 2017.07.18
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
public class CozaLozaWoza {
    //attributes
    private int lowerBound;
    private int upperBound;

    //behaviours
    //initialize getters & setters
    public int getLowerBound() {
        return lowerBound;
    }
    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }
    public int getUpperBound() {
        return upperBound;
    }
    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }
    //end of getters & setters

    //method for print "COZA", "LOZA" & "WOZA"
    public void printNum() {
        int currentNumber;
        for (currentNumber = lowerBound; currentNumber <= upperBound; currentNumber++) {
            if (currentNumber % 3 == 0) {
                System.out.print("Coza");
            }
            if (currentNumber % 5 == 0) {
                System.out.print("Loza");
            }
            if (currentNumber % 7 == 0) {
                System.out.print("Woza");
            }
            if (currentNumber % 3 != 0 && currentNumber % 5 != 0 && currentNumber % 7 != 0) {
                System.out.print(currentNumber);
            }
            if (currentNumber % 11 == 0) {
                System.out.print("\n");
            }else {
                System.out.print(" ");
            }
        }
    }
    //main method
    public static void main(String[] args) {
        CozaLozaWoza CLW = new CozaLozaWoza();
        
        CLW.setLowerBound(1);
        CLW.setUpperBound(110);
        CLW.printNum();
    }
}
