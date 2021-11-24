package codeforces;
//Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.
//Rigght now, Limak and Bob weigh a and b respectively. it's guaranteed that Limak's weight is smaller than or equal to his brother's weight.
//Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.
//After how many full years will Limak become strictly larger (strictly heavier) than Bob?
public class Bear_And_Big_brother {
	public static void main(String[] args) {
		FastInput f = new FastInput();
		int a = f.nextInt();
		int b = f.nextInt();
		int years = 0;
		for(; a <= b; ++years) {
			a*=3;
			b*=2;
//			System.out.printf("%d %d\n",a,b);
		}
		System.out.println(years);
	}
}
