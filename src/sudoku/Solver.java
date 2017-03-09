package sudoku;

public class Solver {
	
	public static void main(String[] args) {
		// puzzle array
		int[][] sudoku = {
				{7,0,5,6,0,9,0,0,8},
				{0,0,0,0,0,1,0,6,0},
				{1,0,4,0,0,0,2,0,0},
				{0,0,9,2,0,3,0,0,4},
				{3,0,0,0,5,0,0,0,1},
				{2,0,0,8,0,4,7,0,0},
				{0,0,0,0,0,0,5,0,2},
				{0,8,0,5,0,0,0,0,0},
				{5,0,0,1,0,2,4,0,7}
		};
	
		// solve the sudoku here
	
		// print out the solved version
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int num = sudoku[i][j];
				if (num == 0) {
					System.out.print(" ");
				} else {
					System.out.print(sudoku[i][j]);
				}
			}
			System.out.println();
		}
	}

}
