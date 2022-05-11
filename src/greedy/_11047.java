package greedy;

import java.io.*;
import java.util.*;

public class _11047 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n+1];
		int count = 0;
		
		for(int i=0; i<n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		for(int i=n-1; i>=0; i--) {
			count += k/coin[i];
			k = k % coin[i];
		}
		System.out.println(count);
	}
}
