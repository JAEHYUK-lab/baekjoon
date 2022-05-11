package function;

import java.io.*;

public class _1065 {
	public static int isometric(int n) {
		int a,b,c, number=0;
		
		for(int i=1; i<=n; i++) {
			if(i>=100 && i<1000) {
				a = i/100;
				b = (i%100)/10;
				c = (i%100)%10;
				if(c-b == b-a) {
					number++;
				}	
			}
			else if(i>0 && i<100)
				number++;
		}
		
		return number;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(isometric(num));
	}
}
