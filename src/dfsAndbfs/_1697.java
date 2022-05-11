package dfsAndbfs;

import java.io.*;
import java.util.*;

public class _1697 {
	private static int n, k;
	private static void bfs(int [] check, int x, int k) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(x);
		check[x] = 0;
		
		while(!q.isEmpty()) {
			int n = q.poll();
			
			if(check[k] != 0)
				break;
			if(n+1 < check.length && check[n+1] == 0) {
				check[n+1] = check[n] + 1;
				q.offer(n+1);
			}
			if(n-1 >= 0 && check[n-1] == 0) {
				check[n-1] = check[n] + 1;
				q.offer(n-1);
			}
			if(n*2 < check.length && check[n*2] == 0) {
				check[n*2] = check[n] + 1;
				q.offer(n*2);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		int check[] = new int[100001];
		
		if(n == k) {
			System.out.println(0);
			return;
		}
		bfs(check, n, k);
		
		System.out.println(check[k]);
	}
}
