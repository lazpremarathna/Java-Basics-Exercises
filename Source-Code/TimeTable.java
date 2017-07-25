/**
 *
 * @author LazPremarathna
 * @date 2017.07.24
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
public class TimeTable {
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
    
    public void printTimeTable() {
        int row;
        int column;
        int result;
        System.out.print("  " + "*" +" |");
        for (column = 1; column <= rowsNcolums; column++) {
            if (column < 10) {
                System.out.print("   " + column);
            } else {
                System.out.print("  " + column);
            }
        }
        System.out.print("\n");
        for (int repeat = 1; repeat <= (rowsNcolums*5-5); repeat++) {
            System.out.print("-");
        }
        System.out.print("\n");
        for (row = 1; row<= rowsNcolums; row++) {
            if (row < 10) {
                System.out.print("  " + row +" |");
            } else {
                System.out.print(" " + row +" |");
            }
            for (column = 1; column <= rowsNcolums; column++) {
                result = row * column;
                if (result < 10) {
                    System.out.print("   " + result);
                }else if(result < 100) {
                    System.out.print("  " + result);
                }else {
                    System.out.print(" " + result);
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        TimeTable TT = new TimeTable();

        TT.setRowsNcolums(12);
        TT.printTimeTable();
    }
}
