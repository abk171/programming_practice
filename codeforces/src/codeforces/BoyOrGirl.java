package codeforces;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;

//http://codeforces.com/contest/236/problem/A
public class BoyOrGirl {
	public static void main(String[] args) throws FileNotFoundException{
		FastInput f = new FastInput(new FileReader("username.in"));
		String s = f.next();
		HashSet<Character> hash = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			hash.add(s.charAt(i));
		}
		String out = hash.size()%2 == 1 ? "IGNORE HIM!" : "CHAT WITH HER!";
		System.out.println(out);
	}
}
