package codeforces;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FastInput {
	BufferedReader br;
	StringTokenizer st;
	
	public FastInput() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public FastInput(FileReader f) {
		br = new BufferedReader(f);
	}
	
	String next() {
		while(st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}
	
	int nextInt() {
		return Integer.parseInt(next());
	}
	
	long nextLong() {
		return Long.parseLong(next());
	}
	
	double nextDouble() {
		return Double.parseDouble(next());
	}
	
	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	
}
