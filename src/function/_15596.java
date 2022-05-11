package function;

import java.io.*;

public class _15596 {
	public static long sum(int[] a) {
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[1000000];
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<=n; i++) {
			a[i] = i;
		}
		
		sum(a);
	}
	
}
