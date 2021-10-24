package competition;

import java.io.FileReader;
import java.io.IOException;

public class k_downloader {
	public static void main(String[] args) throws IOException{
		FastInput f = new FastInput(new FileReader("downloader.in"));
		int n = f.nextInt();
		int k = f.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = f.nextInt();
		}
		//this array is already increasing order sorted
		long sum = 0;
		for(int i = n-1; i >= 0; i-=k) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
