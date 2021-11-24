package codeforces;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Word {
	public static void main(String[] args) throws FileNotFoundException{
//		FastInput f = new FastInput(new FileReader("Word.in"));
		FastInput f = new FastInput();
		String s = f.next();
		
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		boolean upper = true;
		for(int i = 0; i < arr.length; i++) {
			if(Character.isUpperCase(arr[i])) {
				if(i < arr.length/2-1) upper = false;
				else upper = true;
			}
			break;
		}
		s = upper ? s.toUpperCase() : s.toLowerCase();
		System.out.println(s);
	}
}
