package basic_math2;

import java.io.*;
import java.util.*;

public class _1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int size = n - m + 1;
		int[] array = new int[size];
		
		if (m >= 1 && n <= 1000000) {
			for (int i = 0; i < size; i++) {
				array[i] = m;
				m++;
			}

			for (int i = 0; i < array.length; i++) {
				boolean isPrime = true;
				if (array[i] == 1)
					continue;
				for (int j = 2; j <= Math.sqrt(array[i]); j++) {
					if (array[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime)
					System.out.println(array[i]);
			}
		}

	}
}
