package codeforces;

import java.io.FileNotFoundException;
import java.io.FileReader;

//http://codeforces.com/contest/263/problem/A
public class BeautifulMatrix {
	public static void main(String[] args) throws FileNotFoundException {
		FastInput f = new FastInput(new FileReader("Matrix.in"));
		int a;
		int moves = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				a = f.nextInt();
				if(a == 1) {
					moves = Math.abs(2-i) + Math.abs(2-j);
					break;
				}
			}
		}
		System.out.println(moves);
	}
}
