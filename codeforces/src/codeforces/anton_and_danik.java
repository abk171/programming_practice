package codeforces;
import java.util.Scanner;

public class anton_and_danik {
	//Anton like to play chess and so does his friend Danik
	//Once they have played n games in a row. For each game it's know who was the winner - Anton or Danik. None of the games ended with a tie.
	//Now Anton wonders, who won more games, he or Danik? Help him determine this.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String g = s.next();
		int a = 0, d = 0;
		char c;
		for(int i = 0; i < n; i++) {
			c = g.charAt(i);
			if(c == 'A') {
				a++;
			}
			else {
				d++;
			}
			if(a > n/2 || d > n/2) {
				break;
			}
			
		}
		if(a > d) {
			System.out.println("Anton");
		}
		else if(a < d) {
			System.out.println("Danik");
		}
		else {
			System.out.println("Friendship");
		}
		s.close();
	}
}
