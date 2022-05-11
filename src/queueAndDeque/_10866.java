package queueAndDeque;

import java.io.*;
import java.util.*;

public class _10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new ArrayDeque<>();
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push_front":
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if(deque.isEmpty())
					System.out.println(-1);
				else
					System.out.println(deque.removeFirst());
				break;
			case "pop_back":
				if(deque.isEmpty())
					System.out.println(-1);
				else
					System.out.println(deque.removeLast());
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if(deque.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				if(deque.isEmpty())
					System.out.println(-1);
				else
					System.out.println(deque.getFirst());
				break;
			case "back":
				if(deque.isEmpty())
					System.out.println(-1);
				else
					System.out.println(deque.getLast());
				break;
			}
		}
	}
}

