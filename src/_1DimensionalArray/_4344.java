package _1DimensionalArray;

import java.util.*;
import java.io.*;

public class _4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double n, count=0, avg=1;
		int c, sum=0;
		
		c = Integer.parseInt(br.readLine());
		int score[] = new int[1000];
		
		for(int i=0; i<c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken());
			
			for(int j=0; j<n; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
				avg = sum/n;
			}
			for(int j=0; j<n; j++) {
				if(score[j]>avg)
					count++;
			}
			System.out.println(String.format("%.3f", (count/n)*100) + "%");
			//System.out.printf("%.3f%%\n", (count/n)*100);
			sum=0;
			count=0;
		}
	}
}
