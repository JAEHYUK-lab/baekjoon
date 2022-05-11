package binarySearch;

import java.io.*;
import java.util.*;

public class _2110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int[] house = new int[n];
		for (int i = 0; i < n; i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(house);
		
		int low = 1;
		int max = house[n-1] - house[0];
		int answer = 0;
		
		while (low <= max) {
			int mid = (low + max) / 2;
			int left = house[0];
			int len = 1;
			
			for (int i = 1; i < n; i++) {
				if(house[i] - left >= mid) {
					len++;
					left = house[i];
				}
			}
			if (len < c) {
				max = mid - 1;
			} else if (len >= c) { 
				answer = mid;
				low = mid + 1;
			}
		}

		System.out.println(answer);
	}
}
