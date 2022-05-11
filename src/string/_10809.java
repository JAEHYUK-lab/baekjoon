package string;

import java.io.*;

public class _10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
		char[] alpa = new char[26];
		char[] syllable = new char[100];
		int[] num = new int[26];
		
		for(int i=0; i<alpa.length; i++) {
			alpa[i] = (char)('a' + i);
			num[i] = -1;
		}
		for(int i=0; i<word.length(); i++) {
			syllable[i] = word.charAt(i);
		}
		for(int i=0; i<num.length; i++) {
			 for(int j=0; j<word.length(); j++) {
				 if(syllable[j] == alpa[i])
					 if(num[i] == -1)
						 num[i] = j;
				
			 }
			 System.out.println(num[i]);
			 
		}
	}
}
