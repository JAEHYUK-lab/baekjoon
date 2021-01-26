package recursion;

import java.io.*;

public class _10872 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double fact = 1;
		
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		System.out.print((int)fact);
	}
}
