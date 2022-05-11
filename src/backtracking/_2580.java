package backtracking;

import java.io.*;
import java.util.*;

public class _2580 {
	public static int[][] array = new int[9][9];
	
	public static void sudoku(int row, int col) {
		if(col == 9) {
			sudoku(row+1, 0);
			return;
		}
		
		if(row == 9) {
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sb.append(array[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb);
			System.exit(0);
		}
		
		if(array[row][col] == 0) {
			for(int i=1; i<=9; i++) {
				if(possibility(row, col, i)) {
					array[row][col] = i;
					sudoku(row, col+1);
				}
			}
			array[row][col] = 0;
			return;
		}
		sudoku(row, col+1);
	}
	
	public static boolean possibility(int row, int col, int value) {
		for(int i=0; i<9; i++) {
			if(array[row][i] == value)
				return false;
		}
		
		for(int i=0; i<9; i++) {
			if(array[i][col] == value)
				return false;
		}
		
		int setRow = (row/3) * 3;
		int setCol = (col/3) * 3;
		
		for(int i=setRow; i<setRow+3; i++) {
			for(int j=setCol; j<setCol+3; j++) {
				if(array[i][j] == value)
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<9; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sudoku(0, 0);
	}
}
 