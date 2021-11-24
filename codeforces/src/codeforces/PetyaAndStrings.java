package codeforces;

import java.io.FileNotFoundException;
import java.io.FileReader;

//http://codeforces.com/contest/112/problem/A
public class PetyaAndStrings {
	public static void main(String[] args) throws FileNotFoundException{
		FastInput f = new FastInput(new FileReader("pas.in"));
		String a = f.next();
		String b = f.next();
		int answer = 0;
		if(a.compareToIgnoreCase(b) > 0) {
			answer = 1;
		}
		else if(a.compareToIgnoreCase(b) < 0){
			answer = -1;
		}
		System.out.println(answer);
	}
}
