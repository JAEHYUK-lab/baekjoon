package dynamicProgramming;

import java.io.*;

public class _2579 {
	public static int[] score;
	public static Integer[] fin;
	
	public static int stairs(int n) {
		if(fin[n] == null) {
			fin[n] = Math.max(stairs(n-2), stairs(n-3) + score[n-1]) + score[n];
		}
		return fin[n];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		score = new int[n+1];
		fin = new Integer[n+1];
		
		for(int i=1; i<=n; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		fin[0] = score[0];
		fin[1] = score[1];
		
		if(n >= 2) {
			fin[2] = score[1] + score[2];
		}
		
		System.out.println(stairs(n));
	}
}
