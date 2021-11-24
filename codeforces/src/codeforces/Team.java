package codeforces;

import java.io.FileNotFoundException;
import java.io.FileReader;

//One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

//This contests offers n problems to the participants. For each problem we know, which friend is sure about the solutoin. help the friends find the number of problems for which they will write a solution.
public class Team {
	public static void main(String[] args) throws FileNotFoundException {
		FastInput f = new FastInput(new FileReader("Team.in"));
		int n = f.nextInt();
		int count = 0;
		int a, b, c;
		for(int i = 0; i < n; i++ ) {
			a = f.nextInt();
			b = f.nextInt();
			c = f.nextInt();
			count = (a+b+c >= 2) ? count+1: count;
		}
		System.out.println(count);
	}
}
