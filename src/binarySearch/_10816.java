package binarySearch;

import java.io.*;
import java.util.*;

public class _10816 {

	/*private static int getCnt(int[] cards, int x, int n) {
		int left = 0;
		int right = n - 1;
		int cnt = 0;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (x < cards[mid]) {
				right = mid - 1;
			} else if (x > cards[mid]) {
				left = mid + 1;
			} else {
				cnt = 1;
				int tmp = mid;

				while (--tmp >= 0 && cards[tmp] == x) {
					cnt++;
				}
				while (++mid < n && cards[mid] == x) {
					cnt++;
				}

				break;
			}
		}
		return cnt;
	}*/

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// StringBuilder 사용
		StringBuilder sb = new StringBuilder();

		int[] num = new int[20000001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			num[Integer.parseInt(st.nextToken()) + 10000000]++;
		}

		int m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			sb.append(num[Integer.parseInt(st.nextToken()) + 10000000]).append(" ");
		}

		System.out.println(sb);

		// 배열 사용
		/*int[] num1 = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			num1[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());
		int[] num2 = new int[m];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			num2[i] = Integer.parseInt(st.nextToken());
		}

		int[] num3 = new int[m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (num1[i] == num2[j])
					num3[j]++;
			}
		}

		for (int i = 0; i < m; i++) {
			System.out.print(num3[i] + " ");
		}*/

		// 이분탐색 사용
		/*StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(num);

		int m = Integer.parseInt(br.readLine());

		StringBuffer sb = new StringBuffer();
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			int x = Integer.parseInt(st.nextToken());
			int cnt = getCnt(num, x, n);
			sb.append(cnt + " ");
		}

		System.out.println(sb);*/
	}
}
