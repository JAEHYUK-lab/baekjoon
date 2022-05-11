package function;

import java.util.*;

public class _4673 {
	public static int selfNumber(int n) {
		int num = n;
		while(n != 0) {
			num = num + (n%10);
			n = n/10;
		}
		return num;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		for(int i=1; i<10001; i++) {
			hs.add(i);
			hs2.add(selfNumber(i));
		}
		hs.removeAll(hs2);
		
		for(int n : hs)
			System.out.println(n);
	}
	
}
