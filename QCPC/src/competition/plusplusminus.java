package competition;
import java.io.FileReader;
import java.io.IOException;

public class plusplusminus {
	public static void main(String[] args) throws IOException {
		FastInput f = new FastInput(new FileReader("plus.in"));
		int x = f.nextInt();
		int y = f.nextInt();
		long l = f.nextLong();
		long r = f.nextLong();
		
		long sum = factors(l,r,x) + factors(l,r,y) - factors(l,r,lcm(x,y));
		System.out.println(sum);
//		System.out.println(lcm(10, 15));
		
	}
	
	public static int gcd(int x, int y) {
		int[] arr = new int[2];
		arr[0] = Math.max(x, y);
		arr[1] = Math.min(x, y);
		int temp;
		while(arr[0] != 0 && arr[1] != 0) {
			temp = arr[0];
			arr[0] = arr[1]; 
			arr[1] = temp % arr[1];
		}
		return arr[1] == 0 ? arr[0] : arr[1];
	}
	
	public static int lcm(int x, int y) {
		int g = gcd(x,y);
		return (x*y)/g;
	}
	
	public static long factors(long l, long r, int d) {
		return (l/d + r/d);
	}
}
