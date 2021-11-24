package codeforces;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SerejaAndDima {
	public static void main(String[] args) throws FileNotFoundException{
		FastInput f = new FastInput(new FileReader("cards.in"));
		
		int n = f.nextInt();
		int sereja = 0;
		int dima = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = f.nextInt();
		}
		for(int i = 0; i < n/2; i++) {
			sereja += Math.max(arr[i], arr[n-i-1]);
			dima += Math.min(arr[i], arr[n-i-1]);
		}
		System.out.printf("%d %d\n",sereja,dima);
	}
}
