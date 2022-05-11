package greedy;

import java.io.*;
import java.util.*;

public class _1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[][] meet = new int[n][2];
		int count = 0;
		int time = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) {
				meet[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Arrays.sort(meet, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1])
					return o1[0] - o2[0];

				return o1[1] - o2[1];
			}

		});

		for (int i = 0; i < n; i++) {
			if (time <= meet[i][0]) {
				time = meet[i][1];
				count++;
			}
		}

		System.out.println(count);

	}
}
