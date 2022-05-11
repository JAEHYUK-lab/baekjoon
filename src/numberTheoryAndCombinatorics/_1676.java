package numberTheoryAndCombinatorics;

import java.io.*;

public class _1676 {
	public static int zeroInFact(int n) {
		int count = 0;
		while(n >= 5) {
			count += n / 5;
			n = n / 5;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(zeroInFact(n));
	}	
}
