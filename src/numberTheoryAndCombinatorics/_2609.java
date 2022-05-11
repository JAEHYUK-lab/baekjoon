package numberTheoryAndCombinatorics;

import java.io.*;
import java.util.*;

public class _2609 {
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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int n = gcd(a,b);
		int m = lcf(a,b);
		
		System.out.println(n + "\n" + m);
	}	
}
