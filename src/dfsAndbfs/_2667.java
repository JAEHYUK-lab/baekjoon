package dfsAndbfs;

import java.awt.Point;
import java.io.*;
import java.util.*;

public class _2667 {
	private static int n;
	private static int[][] house;
	private static boolean[][] exist;
	
	private static int bfs(int x, int y) {
		Queue<Point> q = new LinkedList<>();
		int val = 0;
		exist[x][y] = true;
		q.offer(new Point(x, y));

		while (!q.isEmpty()) {
			Point now = q.poll();
			
			if (check(now.x - 1, now.y)) {
				q.offer(new Point(now.x-1, now.y));
				exist[now.x-1][now.y] = true;
			}
				
			if (check(now.x, now.y + 1)) {
				q.offer(new Point(now.x, now.y+1));
				exist[now.x][now.y+1] = true;
			}
				
			if (check(now.x + 1, now.y)) {
				q.offer(new Point(now.x+1, now.y));
				exist[now.x+1][now.y] = true;
			}
				
			if (check(now.x, now.y - 1)) {
				q.offer(new Point(now.x, now.y-1));
				exist[now.x][now.y-1] = true;
			}
			val++;
		}
		return val;
	}

	private static int dfs(int x, int y) {
		int val = 1;
		exist[x][y] = true;

		if (check(x - 1, y))
			val += dfs(x - 1, y);
		if (check(x, y + 1))
			val += dfs(x, y + 1);
		if (check(x + 1, y))
			val += dfs(x + 1, y);
		if (check(x, y - 1))
			val += dfs(x, y - 1);

		return val;

	}

	public static boolean check(int x, int y) {
		if (x < 1 || x > n || y < 1 || y > n)
			return false;
		if (exist[x][y] == true || house[x][y] == 0)
			return false;
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		n = Integer.parseInt(br.readLine());
		house = new int[n + 1][n + 1];
		exist = new boolean[n + 1][n + 1];
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < n + 1; i++) {
			String str = br.readLine();
			for (int j = 1; j < n + 1; j++) {
				house[i][j] = str.charAt(j - 1) - '0';
			}
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (check(i, j)) {
					int val = bfs(i, j);
					//int val = dfs(i, j);
					list.add(val);
				}
			}
		}

		Collections.sort(list);
		sb.append(list.size()).append("\n");
		for (int num : list)
			sb.append(num).append("\n");

		System.out.println(sb);
	}
}
