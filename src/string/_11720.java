package string;

import java.io.*;

public class _11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum=0;
		
		String numbers = br.readLine();
		int[] num = new int[n];
		
		for(int i=0; i<numbers.length(); i++) {
			num[i] = numbers.charAt(i) - '0';
			sum += num[i];
		}
		System.out.println(sum);
	}
	
}
