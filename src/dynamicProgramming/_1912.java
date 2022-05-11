package dynamicProgramming;

import java.io.*;
import java.util.*;

public class _1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		int[] dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = num[0];
		int max = num[0];
		
		for(int i=1; i<n; i++) {
			//현재값과 현재값까지의 연속합 중 큰 값
			dp[i] = Math.max(dp[i-1] + num[i], num[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
