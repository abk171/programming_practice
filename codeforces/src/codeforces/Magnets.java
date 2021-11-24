package codeforces;

import java.io.FileNotFoundException;
import java.io.FileReader;

//http://codeforces.com/contest/344/problem/A
public class Magnets {
	public static void main(String[] args) throws FileNotFoundException{
		FastInput f = new FastInput(new FileReader("magnets.in"));
		
		int n = f.nextInt();
		int a, b = 0;
		int count = 0;
		for(int i = 0; i < n; i++) {
			a = f.nextInt();
			if(a!=b) count++;
			b = a;
		}
		
		System.out.println(count);
	}
}
