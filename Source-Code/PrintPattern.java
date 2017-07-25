/**
 *
 * @author LazPremarathna
 * @date 2017.07.24
 * find the exercise on https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
 */
public class PrintPattern {
    //attributes
    private int rowsNcolums;

    //behaviours
    //initialize getters & setters
	/**
	* Returns value of rows
	* @return
	*/
	public int getRowsNcolums() {
		return rowsNcolums;
	}

	/**
	* Sets new value of rows
	* @param
	*/
	public void setRowsNcolums(int rowsNcolums) {
		this.rowsNcolums = rowsNcolums;
	}
    //end of getters & setters

    /**
    * this method prints triangle like below
    * #
    * # #
    * # # #
    * # # # #
    */
    public void printPattern_a() {
        System.out.print("\n");
        for (int row = 1; row <= rowsNcolums; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }

    /**
    * this method prints triangle like below
    * # # # #
    * # # #
    * # #
    * #
    */
    public void printPattern_b() {
        System.out.print("\n");
        for (int row = 1; row <= rowsNcolums; row++) {
            for (int column = rowsNcolums; column >= row; column--) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }

    /**
    * this method prints triangle like below
    * # # # #
    *   # # #
    *     # #
    *       #
    */
    public void printPattern_c() {
        System.out.print("\n");
        for (int row = 1; row <= rowsNcolums; row++) {
            for (int space = 0; space < row; space++) {
                if (space > 0) {
                    System.out.print("  ");
                }else {
                    System.out.print("");
                }
            }
            for (int column = rowsNcolums; column >= row; column--) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }

    /**
    * this method prints triangle like below
    *       #
    *     # #
    *   # # #
    * # # # #
    */
    public void printPattern_d() {
        System.out.print("\n");
        for (int row = 1; row <= rowsNcolums; row++) {
            for (int space = rowsNcolums-row; space > 0; space--) {
                System.out.print("  ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }

    /**
    * this method prints square like below
    * # # # # #
    * #       #
    * #       #
    * #       #
    * # # # # #
    */
    public void printPattern_e() {
        System.out.print("\n");
        for (int row = 1; row <= rowsNcolums-1; row++) {
            if (row == 1 || row == rowsNcolums-1) {
                for (int column = 1; column <= rowsNcolums-1; column++) {
                    System.out.print("# ");
                }
                System.out.print("\n");
            } else {
                for (int column = 1; column <= rowsNcolums-1; column++) {
                    if (column == 1 || column == rowsNcolums-1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("\n");
            }
        }
    }

    /**
    * this method prints "Z" like below
    * # # # # #
    *   #
    *     #
    *       #
    * # # # # #
    */
    public void printPattern_f() {
        System.out.print("\n");
        for (int row = 1; row <= rowsNcolums-1; row++) {
            if (row == 1 || row == rowsNcolums-1) {
                for (int column = 1; column <= rowsNcolums-1; column++) {
                    System.out.print("# ");
                }
                System.out.print("\n");
            } else {
                for (int column = 1; column < row; column++) {
                    System.out.print("  ");
                }
                System.out.print("#");
                System.out.print("\n");
            }
        }
    }

    /**
    * this method prints "Z" like below
    * # # # # #
    *       #
    *     #
    *   #
    * # # # # #
    */
    public void printPattern_g() {
        System.out.print("\n");
        for (int row = 1; row <= rowsNcolums-1; row++) {
            if (row == 1 || row == rowsNcolums-1) {
                for (int column = 1; column <= rowsNcolums-1; column++) {
                    System.out.print("# ");
                }
                System.out.print("\n");
            } else {
                for (int column = 1; column < rowsNcolums-row; column++) {
                    System.out.print("  ");
                }
                System.out.print("#");
                System.out.print("\n");
            }
        }
    }

    /**
    * this method prints object like below
    *  # # # # #
    *    #   #
    *      #
    *    #   #
    *  # # # # #
    */
    public void printPattern_h() {
        System.out.print("\n");

        int row;
        int column;
        //upeer triangle part
        for (row = 1; row <= rowsNcolums/2; row++) {
            //first line
            if (row == 1) {
                for (column = 1; column <= rowsNcolums-1; column++) {
                    System.out.print("# ");
                }
                System.out.print("\n");
            //center line
            } else if (row == rowsNcolums/2) {
                for (column = 1; column < rowsNcolums/2; column++) {
                    System.out.print("  ");
                }
                System.out.println("# ");
            //diagonals
            } else {
                for (column = 1; column <= rowsNcolums-1; column++) {
                    //main diagonal
                    if (column == row) {
                        System.out.print("# ");
                    //opposite diagonal
                    } else if (row + column == rowsNcolums) {
                        System.out.print("# ");
                    //rest spaces
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("\n");
            }
        }
        //lower triangle part
        for (row = rowsNcolums/2 + 1; row <= rowsNcolums-1; row++) {
            //last line
            if (row == rowsNcolums-1) {
                for (column = 1; column <= rowsNcolums-1; column++) {
                    System.out.print("# ");
                }
                System.out.print("\n");
            //diagonals
            } else {
                for (column = 1; column <= rowsNcolums-1; column++) {
                    //opposite diagonal
                    if (row + column == rowsNcolums) {
                        System.out.print("# ");
                    //main diagonal
                    } else if (column == row) {
                        System.out.print("# ");
                    //rest spaces
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
    public static void main(String[] args) {
        PrintPattern PP = new PrintPattern();

        PP.setRowsNcolums(8);
        PP.printPattern_a();
        PP.printPattern_b();
        PP.printPattern_c();
        PP.printPattern_d();
        PP.printPattern_e();
        PP.printPattern_f();
        PP.printPattern_g();
        PP.printPattern_h();
    }
}
