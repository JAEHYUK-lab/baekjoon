package _1DimensionalArray;

import java.io.*;
import java.util.*;

public class _3052 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hs.add(Integer.valueOf(br.readLine()) %42);
		}
		
		System.out.println(hs.size());
	}
}
