/**
 *
 * @author LazPremarathna
 * @date 2017.07.18
 */
public class SquareBoard  {
    private int rowsNcolums;

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

    public void printSquareBoard() {
        for (int row = 1; row <= rowsNcolums; row++) {
            for (int column = 1; column <= rowsNcolums; column++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        SquareBoard SB = new SquareBoard();
        SB.setRowsNcolums(10);
        SB.printSquareBoard();
    }
}
