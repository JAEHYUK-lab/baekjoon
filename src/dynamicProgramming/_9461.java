package dynamicProgramming;

import java.io.*;

public class _9461 {
	static long[] pado = new long [101];

	public static void padovan() {
		for(int i=1; i<4; i++) {
			pado[i] = 1;
		}
		for(int i=4; i<pado.length; i++) {
			pado[i] = pado[i-2] +pado[i-3];
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		padovan();
		
		for(int i=0; i<n; i++) {
			sb.append(pado[Integer.parseInt(br.readLine())]).append('\n');
		}
		System.out.println(sb);
		
	}
}
