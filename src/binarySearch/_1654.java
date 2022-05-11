package binarySearch;

import java.io.*;
import java.util.*;

public class _1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int k = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());

		long[] lan = new long[k];
		for (int i = 0; i < k; i++) {
			lan[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(lan);
		
		long low = 1;
		long max = lan[k-1];
		
		while (low <= max) {
			long mid = (low + max) / 2;
			long len = 0;
			for (int i = 0; i < lan.length; i++) {
				len += lan[i] / mid;
			}
			if (len < n) {
				max = mid - 1;
			} else if (len >= n) { 
				low = mid + 1;
			}
		}

		System.out.println(max);
	}
}
