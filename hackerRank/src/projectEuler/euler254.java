package projectEuler;

public class euler254 {
	public static int factorial(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		int product = 1;
		while(n > 0) {
			product *= n;
			n--;
		}
		
		return product;
	}
	
	public static int sum_factorial(int n) {
		int sum = 0;
		while(n > 0) {
			sum += factorial(n%10);
			n /= 10;
		}
		return sum;
	}
	//this only finds the sum of the digits in the given integer
	public static int sum_digits(int n) {
		int sum = 0;
		
		while(n > 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	
	
	public static int reverse_sum_factorial(int n) {
		int sum = 0;
		int factor = 1;
		int place = 1;
		while(n > 0) {

			factor = 1;
			while(factorial(factor) < n && factor < 10) {
				factor++;
			}

			if(factorial(factor) != n) {
				factor -= 1;
			}
			sum += place*(factor);
			place *= 10;

			n-=factorial(factor);
//			System.out.println(n + " " + factor);
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
//		System.out.println(factorial(5));
//		System.out.println(sum_factorial(342));
//		System.out.println(sum_digits(sum_factorial(11111)));
//		System.out.println(reverse_sum_factorial(11111));
//		System.out.println(reverse_sum_factorial(sum_digits(sum_factorial(267))));
		//25 gives 122 gives 5
		//342 gives 32 gives 5
		//267 gives 5762 gives 20
		//
		//we want 25
		//so from 5 we must generate all possible combinations that give us the sum 5
		//5 would have 
	}
}
