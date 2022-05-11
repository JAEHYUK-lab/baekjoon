package divideAndConquer;

import java.io.*;

public class _1992 {
	private static int n, m;
	private static int tree[][];

	private static boolean check(int row, int col, int n) {
		int std = tree[row][col];
		for (int i = row; i < row + n; i++) {
			for (int j = col; j < col + n; j++) {
				if (std != tree[i][j]) {
					return false;
				}
			}
		}
		m = std;
		return true;
	}

	public static void quad(int row, int col, int n) {
		if (check(row, col, n)) {
			System.out.print(m);
		} else {
			System.out.print("(");
			int a = n / 2;
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					quad(row + a * i, col + a * j, a);
				}
			}
			System.out.print(")");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		tree = new int[n][n];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				tree[i][j] = Integer.parseInt(str.substring(j, j + 1));
			}
		}
		quad(0, 0, n);
	}
}
