/**
 *
 * @author LazPremarathna
 * @date 2017.07.18
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
public class CheckerBoard  {
    //attributes
    private int rowsNcolums;

    //behaviours
    //initialize getters & setters

    /**
	* Returns value of rowsNcolums
	* @return
	*/
	public int getRowsNcolums() {
		return rowsNcolums;
	}

	/**
	* Sets new value of rowsNcolums
	* @param
	*/
	public void setRowsNcolums(int rowsNcolums) {
		this.rowsNcolums = rowsNcolums;
	}
    //end of getters & setters

    //method for print square
    public void printCheckerBoard() {
        for (int row = 1; row <= rowsNcolums; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            for (int column = 1; column <= rowsNcolums; column++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }
    //main method
    public static void main(String[] args) {
        CheckerBoard CB = new CheckerBoard();

        CB.setRowsNcolums(7);
        CB.printCheckerBoard();
    }
}
