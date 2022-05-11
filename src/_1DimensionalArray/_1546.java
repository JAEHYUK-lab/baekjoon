package _1DimensionalArray;

import java.io.*;
import java.util.*;

public class _1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1;
		double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value > max)
				max = value;
			
			sum += value;
		}
		
		System.out.println( ((sum/max)*100.0)/n );
	}
}
