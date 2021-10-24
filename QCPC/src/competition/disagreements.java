package competition;
import java.io.FileReader;
import java.io.IOException;

public class disagreements {
	public static void main(String[] args) throws IOException {
		FastInput f = new FastInput(new FileReader("disagreements.in"));
		long x = f.nextLong();
		long y = f.nextLong();
		long z = f.nextLong();
		
		if(x == y || x == z || y == z) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
