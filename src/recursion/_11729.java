package recursion;

import java.io.*;

public class _11729 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void hanoi(int n, int a, int b, int c) throws IOException {
		if(n==1) {
			bw.write(a + " " + c + "\n");
			return;
		}
		
		hanoi(n-1, a, c, b);
		bw.write(a + " " + c + "\n");
		hanoi(n-1, b, a, c);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		bw.write((int) (Math.pow(2, n)-1) + "\n");
		hanoi(n, 1, 2, 3);
		
		bw.flush();
		bw.close();
	}
}