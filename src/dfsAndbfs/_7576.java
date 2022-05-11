package dfsAndbfs;

import java.awt.Point;
import java.io.*;
import java.util.*;

public class _7576 {
	private static int n, m;
	private static int[][] tomato;
	private static Queue<Point> q = new LinkedList<>();

	private static int bfs() {
		int[] xArr = { -1, 0, 1, 0 };
		int[] yArr = { 0, 1, 0, -1 };
		int count = 0;

		while (!q.isEmpty()) {
			Point p = q.poll();
			int row = p.x;
			int col = p.y;

			for (int i = 0; i < 4; i++) {
				int x = row + xArr[i];
				int y = col + yArr[i];

				if (check(x, y)) {
					q.add(new Point(x, y));
					tomato[x][y] = tomato[row][col] + 1;
				}
			}
		}
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if (tomato[i][j] == 0)
					return -1;
				count = Math.max(count, tomato[i][j]);
			}
		}
		if (count == 1)
			return 0;
		return (count - 1);
	}

	public static boolean check(int x, int y) {
		if (x < 1 || x > n || y < 1 || y > m)
			return false;
		if (tomato[x][y] == 0)
			return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		tomato = new int[n + 1][m + 1];

		for (int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j < m + 1; j++) {
				tomato[i][j] = Integer.parseInt(st.nextToken());
				if (tomato[i][j] == 1) {
					q.add(new Point(i, j));
				}
			}
		}
		System.out.println(bfs());
	}
}
