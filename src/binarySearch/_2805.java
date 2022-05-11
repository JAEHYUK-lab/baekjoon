package binarySearch;

import java.io.*;
import java.util.*;

public class _2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());

		long[] tree = new long[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(tree);
		
		long low = 1;
		long max = tree[n-1];
		
		while (low <= max) {
			long mid = (low + max) / 2;
			long len = 0;
			for (int i = 0; i < tree.length; i++) {
				if(mid < tree[i])
					len += tree[i] - mid;
			}
			if (len < m) {
				max = mid - 1;
			} else if (len >= m) { 
				low = mid + 1;
			}
		}

		System.out.println(max);
	}
}
