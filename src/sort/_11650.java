package sort;

import java.io.*;
import java.util.*;

public class _11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] num = new int[n][2];
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Arrays.sort(num, (n1, n2) -> {
			if (n1[0] == n2[0])
				return n1[1] - n2[1];
			else
				return n1[0] - n2[0];
		});

		for (int i = 0; i < n; i++) {
			System.out.println(num[i][0] + " " + num[i][1]);
		}
	}
}
