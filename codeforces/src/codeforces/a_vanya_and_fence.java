package codeforces;
import java.util.Scanner;

public class a_vanya_and_fence {
	//Vanya and his friends are walking along the fence of height h and they do not want the guard to notice them. In order to achieve this the height of each of the friends should not exceed h. If the height of some person is greater than h he can bend down and then he surely won't be noticed by the guard. The height of the i-th person is equal to ai.
	//Consider the width of the person walking as usual to equal to 1, while the width of the bent person is equal to 2. Friends want to talk to each other while walking so they would like to walk in a single row. What is the minimum width of the road, such that friends can walk in a row and remain unattended by the guard?
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int height = s.nextInt();
		int current;
		int sum = 0;
		for(int i = 0; i < size; i++) {
			current = s.nextInt();
			if(current > height) {
				sum += 2;
			}
			else {
				sum += 1;
			}
		}
		s.close();
		System.out.println(sum);
	}
}
