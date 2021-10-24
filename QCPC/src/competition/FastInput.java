package competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.FileReader;

public class FastInput {
	
	BufferedReader br;
	StringTokenizer st;
	
	public FastInput() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public FastInput(FileReader f)  {
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
	
	double nextDouble() {
		return Double.parseDouble(next());
	}
	
	long nextLong() {
		return Long.parseLong(next());
	}
	
	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
