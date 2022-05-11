package sort;

import java.io.*;
import java.util.*;

public class _10814 {
	public static void main(String[] args) throws IOException {
		//BufferedReader + StringBuilder[] + StringBuilder
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		StringBuilder[] p = new StringBuilder[201];
		
		for(int i=0; i<p.length; i++) {
			p[i] = new StringBuilder();
		}
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[age].append(age).append(' ').append(name).append('\n');
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(StringBuilder val : p) {
			sb.append(val);
		}
		System.out.println(sb);
		
		//String[][] + BufferedReader
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[][] num = new String[n][2];
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) {
				num[i][j] = st.nextToken();
			}
		}

		Arrays.sort(num, (n1, n2) -> {
			return Integer.parseInt(n1[0]) - Integer.parseInt(n2[0]);
		});

		for (int i = 0; i < n; i++) {
			System.out.println(num[i][0] + " " + num[i][1]);
		}*/
	}
}