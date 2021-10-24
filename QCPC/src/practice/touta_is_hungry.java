package practice;


import java.io.FileReader;
import java.io.IOException;


public class touta_is_hungry {
	/*
	 * Touta is a clever cat that can surprisingly solve a lot of difficult problems. Her partner likes to challenge her every now and then. Once he wanted to teach her which food plate she should eat from depending on 2 given numbers A and B. Touta should eat from Plate 1 if the sum of the numbers is strictly more than their product or eat from Plate 2 otherwise 
	 */
	public static void main(String[] args) throws IOException {
		FastInput f;
		f = new FastInput(new FileReader("eat.in"));
		int tc = f.nextInt();
		for(int i = 0; i < tc; i++) {
			Long a = f.nextLong();
			Long b = f.nextLong();
			if(a+b > a*b) {
				System.out.println("Plate 1");
			}
			else {
				System.out.println("Plate 2");
			}
		}
		
		
	}
}
