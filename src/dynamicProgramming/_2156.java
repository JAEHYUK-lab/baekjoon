package dynamicProgramming;

import java.io.*;

public class _2156 {
	public static int[] score;
	public static Integer[] dp;

	public static int stairs(int n) {
		if (dp[n] == null) {
			dp[n] = Math.max(Math.max(stairs(n - 2), stairs(n - 3) + score[n - 1]) + score[n], stairs(n - 1));
		}
		return dp[n];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		score = new int[n + 1];
		dp = new Integer[n + 1];

		for (int i = 1; i <= n; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}

		dp[0] = score[0];
		dp[1] = score[1];

		if (n >= 2) {
			dp[2] = score[1] + score[2];
		}

		System.out.println(stairs(n));
	}
}
