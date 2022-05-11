package numberTheoryAndCombinatorics;

import java.io.*;
import java.util.*;

public class _2004 {
	public static long zeroInFact1(long n) {
		int count = 0;
		while(n >= 5) {
			count += n / 5;
			n = n / 5;
		}
		return count;
	}
	
	public static long zeroInFact2(long n) {
		int count = 0;
		while(n >= 2) {
			count += n / 2;
			n = n / 2;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		
		long r1 = zeroInFact1(n)-zeroInFact1(n-m) - zeroInFact1(m);
		long r2 = zeroInFact2(n)-zeroInFact2(n-m) - zeroInFact2(m);
		
		System.out.println(Math.min(r1, r2));
	}	
}
