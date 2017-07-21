/**
 *
 * @author LazPremarathna
 * @date 2017.07.18
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 *  This program prints "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise. The program shall always print "DONE" before exiting.
 */
public class CheckPassFail{
    //attributes
    protected int marks;

    //behaviours
    //initialize getters & setters
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    //end of getters & setters

    //check pass or fail status
    public void checkPassFail(){
        if(marks >= 50){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        System.out.println("--DONE--");
    }
    //main method
    public static void main(String[] args) {
        //create an object
        CheckPassFail CPF = new CheckPassFail();

        CPF.setMarks(65);
        CPF.checkPassFail();
    }
}
