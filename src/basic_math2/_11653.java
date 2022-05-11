package basic_math2;

import java.io.*;

public class _11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int prime = 2;
		while(n>0) {
			if(n%prime == 0) {
				System.out.println(prime);
				n = n/prime;
			}
			if(n%prime != 0)
				prime++;
			if(prime<0 || prime>n)
				break;
		}
	}
}
