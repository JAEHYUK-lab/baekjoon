package divideAndConquer;

import java.io.*;
import java.util.*;

public class _1780 {
	private static int n;
	private static int paper[][];
	private static int[] count = new int[3];
	
	private static boolean check(int row, int col, int n) {
		int std = paper[row][col];
		for (int i = row; i < row + n; i++) {
			for (int j = col; j < col + n; j++) {
				if (std != paper[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void paperNum(int row, int col, int n) {
		if (check(row, col, n)) {
			count[paper[row][col]+1]++;
		} else {
			int a = n / 3;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					paperNum(row + a * i, col + a * j, a);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		paper = new int[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		paperNum(0, 0, n);
		
		for(int i=0; i<3; i++) {
			System.out.println(count[i]);
		}
	}
}
