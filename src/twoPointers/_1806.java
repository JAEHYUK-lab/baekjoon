package twoPointers;

import java.io.*;
import java.util.*;

public class _1806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		int [] num = new int[n+1];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0, end=0, sum=0, count=100001;
		
		while(true) {
			if(sum>=s) {
				sum -= num[start++];
				count = Math.min(count, end-start+1);
			}
			else if(end == n) 
				break;
			else
				sum += num[end++];
		}
		
		if(count==100001) 
			count=0;
		System.out.println(count);
	}

}
