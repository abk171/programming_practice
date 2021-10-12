package backtracking;

public class n_queen {
	public boolean isValid(int[][] board, int row, int col) {
		int i, j;
		for(i = 0; i < col; i++) {
			if(board[row][i] == 1) {
				return false;
			}
		}
		for(i = row, j = col; i >= 0 && j >= 0; i--,j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		for(i = row, j = col; i < board.length && j >= 0; j--,i++) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		return true;
	}
	
	public boolean place_queens(int[][] board, int col) {
		if(col == board.length -1) {
			return true;
		}
		//we check the previous column for safe zones
		for(int i = 0; i < board.length; i++) {
			if(isValid(board,i,col)) {
				board[col][i] = 1;
			}
			//call the recursive function
			//if this fails go to backtrack
			if(place_queens(board,col + 1) == true) {
				return true;
			}
			//this only executes when solution is bad
			//and then it continues with the for loop so that we can get the next best alternative
			board[i][col] = 0;
		}
		return false;
		
		//this is returned when there is no solution possible for the case ex: 2x2 grid and 2 queens
	}
}
