package dynamicProgramming;

import java.io.*;
import java.util.*;

public class _11054 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		int[] inDp = new int[n];
		int[] deDp = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			inDp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (num[j] < num[i] && inDp[i] < inDp[j] + 1) {
					inDp[i] = inDp[j] + 1;
				}
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			deDp[i] = 1;
			for (int j = n - 1; j > i; j--) {
				if (num[j] < num[i] && deDp[i] < deDp[j] + 1) {
					deDp[i] = deDp[j] + 1;
				}
			}
		}

		int max = 0;

		for (int i = 0; i < n; i++) {
			if (max < inDp[i] + deDp[i]) {
				max = inDp[i] + deDp[i];
			}
		}

		System.out.println(max - 1);
	}
}
