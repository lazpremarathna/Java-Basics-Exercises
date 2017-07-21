/**
 *
 * @author LazPremarathna
 * @date 2017.07.18
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
public class SumAndAverage {
    //attributes
    private int maxNumber;
    private int totalSum;
    private double average;

    //behaviours
    //initialize getters & setters
    public int getMaxNumber() {
        return maxNumber;
    }
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
    public int getTotalSum() {
        return totalSum;
    }
    public double getAverage() {
        return average;
    }
    //end of getters & setters

    //using for loop
    public int calculateSumForLoop() {
        int currentNumber;
        for (currentNumber = 1; currentNumber <= maxNumber; currentNumber++) {
            totalSum = totalSum + currentNumber;
        }
        return totalSum;
    }
    //using while-do loop
    public int calculateSumWhileDo() {
        int currentNumber = 1;
        while (currentNumber <= maxNumber) {
            totalSum = totalSum + currentNumber;
            currentNumber++;
        }
        return totalSum;
    }
    //using do-while loop
    public int calculateSumDoWhile() {
        int currentNumber = 1;
        do {
            totalSum = totalSum + currentNumber;
            currentNumber++;
        } while (currentNumber <= maxNumber);
        return totalSum;
    }
    //calculate average
    public double calculateAve() {
        average = totalSum / (double)maxNumber;
        return average;
    }
    public void display() {
        System.out.println("The sum is: " + getTotalSum());
        System.out.println("The average is: " + getAverage());
    }
    //main method
    public static void main(String[] args) {
        SumAndAverage SA = new SumAndAverage();
        SA.setMaxNumber(100);
        //SA.calculateSumForLoop();
        //SA.calculateSumWhileDo();
        SA.calculateSumDoWhile();
        SA.calculateAve();
        SA.display();
    }
}
