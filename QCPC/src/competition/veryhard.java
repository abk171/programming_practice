package competition;

import java.io.FileReader;
import java.io.IOException;

public class veryhard {
	public static void main(String[] args) throws IOException {
		FastInput f = new FastInput(new FileReader("hard.in"));
		int a = f.nextInt();
		if(a != 0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}
}
