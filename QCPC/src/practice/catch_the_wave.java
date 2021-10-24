package practice;

import java.io.IOException;
import java.io.FileReader;

public class catch_the_wave {
	public static void main(String[] args) throws IOException{
		FastInput f = new FastInput(new FileReader("wave.in"));
		int tc = f.nextInt();
		for(int i = 0; i < tc; i++) {
			String s = f.next();
			int count = 1;
			int max = 0;
			for(int j = 1; j < s.length(); j++) {
				if(s.charAt(j) == s.charAt(j-1)) {
//					System.out.println(count);
					max = max < count ? count - 1: max;
					count = 1;
				}
//				System.out.println(s.charAt(j));
				count++;
			}
			if(max == 0) {
				max = count;
			}
			System.out.println(max);
		}
		
	}
}
