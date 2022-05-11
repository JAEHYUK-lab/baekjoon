package dfsAndbfs;

import java.io.*;
import java.util.*;

public class _1260 {
	private static int n, m, v;
	private static ArrayList<ArrayList<Integer>> arList = new ArrayList<>();
	private static boolean[] visit;

	private static void bfs(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		visit[v] = true;
		q.offer(v);

		while (!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " ");

			for (int i = 0; i < arList.get(x).size(); i++) {
				int y = arList.get(x).get(i);
				if (!visit[y]) {
					visit[y] = true;
					q.offer(y);
				}
			}
		}
	}

	private static void dfs(int x) {
		visit[x] = true;
		System.out.print(x + " ");

		for (int i = 0; i < arList.get(x).size(); i++) {
			int y = arList.get(x).get(i);
			if (!visit[y])
				dfs(y);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		visit = new boolean[n + 1];

		for (int i = 0; i < n + 1; i++) {
			arList.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			arList.get(x).add(y);
			arList.get(y).add(x);
		}

		for (int i = 0; i <= n; i++) {
			Collections.sort(arList.get(i));
		}

		dfs(v);
		visit = new boolean[n + 1];
		System.out.println();
		bfs(v);
	}
}
