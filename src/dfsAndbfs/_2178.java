package dfsAndbfs;

import java.awt.Point;
import java.io.*;
import java.util.*;

public class _2178 {
	private static int n, m;
	private static int[][] maze;
	private static int[][] exist;

	private static void bfs() {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(1, 1));
		int[] xArr = { -1, 0, 1, 0 };
		int[] yArr = { 0, 1, 0, -1 };
		exist[1][1] = 1;

		while (!q.isEmpty()) {
			Point p = q.poll();
			int row = p.x;
			int col = p.y;

			for (int i = 0; i < 4; i++) {
				int x = row + xArr[i];
				int y = col + yArr[i];

				if (check(x, y)) {
					q.add(new Point(x, y));
					exist[x][y] = exist[row][col] + 1;
				}
			}
		}
		System.out.println(exist[n][m]);
	}

	public static boolean check(int x, int y) {
		if (x < 1 || x > n || y < 1 || y > m)
			return false;
		if (exist[x][y] != 0 || maze[x][y] == 0)
			return false;
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		maze = new int[n + 1][m + 1];
		exist = new int[n + 1][m + 1];

		for (int i = 1; i < n + 1; i++) {
			String str = br.readLine();
			for (int j = 1; j < m + 1; j++) {
				maze[i][j] = str.charAt(j - 1) - '0';
			}
		}
		bfs();
	}
}
