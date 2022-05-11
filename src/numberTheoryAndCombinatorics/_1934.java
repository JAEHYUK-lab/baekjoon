package numberTheoryAndCombinatorics;

import java.io.*;
import java.util.*;

public class _1934 {
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	public static int lcf(int a, int b) {
		return a*b/gcd(a,b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		//2차원 배열 사용
		/*int[][] num = new int[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<2; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(lcf(num[i][0], num[i][1]));
		}*/
		
		//StringBuilder 사용
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(lcf(a, b)).append('\n');
		}
		System.out.println(sb);
	}	
}
