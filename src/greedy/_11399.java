package greedy;

import java.io.*;
import java.util.*;

public class _11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ¹è¿­ + Arrays.sort
		/*
		int n = Integer.parseInt(br.readLine());
		int[] p = new int[n];
		int[] p1 = new int[n];
		int[] p2 = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(p);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++)
				p1[i] += p[j];
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++)
				p2[i] += p1[j];
		}
		System.out.println(p2[n-1]);*/
		
		//counting sort
		int n = Integer.parseInt(br.readLine());
		int[] p = new int[1001];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(n-- > 0) {
			p[Integer.parseInt(st.nextToken())]++;
		}
		
		int prev = 0;
		int sum = 0;
		
		for(int i=0; i<1001; i++) {
			while(p[i]-- > 0) {
				sum += (i+prev);
				prev += i;
			}
		}
		System.out.println(sum);
	}
}