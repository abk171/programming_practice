package codeforces;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

//http://codeforces.com/contest/405/problem/A
public class GravityFlip {
	public static void main(String[] args) throws FileNotFoundException{
		FastInput f = new FastInput(new FileReader("flip.in"));
		int col = f.nextInt();
		int[] row = new int[col];
		
		for(int i = 0; i < col; i++) {
			row[i] = f.nextInt();
			
		}
		
		Arrays.sort(row);
		for(int i = 0; i < col; i++) {
			System.out.printf("%d ", row[i]);
		}
		System.out.println();
		
		
	}
}
