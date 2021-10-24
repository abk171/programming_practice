package competition;
import java.io.FileReader;
import java.io.IOException;
/*
 * Assem spends his free time playing video games as usual. This time he is trying a newly released battle game.
 * 
 * In this game, the player will fight n enemies and he has to stun them all to win the game. The player should fight all the enemies one by one in the order they are given (player should first stun the enemy at position 1. then position 2, .. and so on).
 * 
 * The player starts the game with initial power P, and each one of the enemies has power pi, the player stuns the ith enemy iff the player power is strictly greater than the enemy power (P > pi).
 * 
 * If the player stunned the ith enemy the player power decreases by pi points. The player also can't continue to fight the enemies at positions greater than i unless he stuns the enemy at position i, and if the player couldn't stun one of the enemies he loses the game immediately.
 * 
 * The player also gets a bonus of bi points after he stuns the ith enemy which increases the player power P by bi points. 
 * 
 * Assem knows the number of enemies and the power of each of them as he tried several times to play the game but he could never win, he decided to spend some of the game coins he saved to upgrade the player's power before he starts the game, he can start the game with any power P he wants but of course the more power he upgrades the player to, the more coins he spends. So, he wants to start the game with the minimum power P that allows him to stun all the monsters in the game.
 * 
 * Can you help him to find the minimum power that allows him to win the game?
 */
public class stun_them_all {
	public static void main(String[] args) throws IOException{
		FastInput f = new FastInput(new FileReader("stun.in"));
		int tc = f.nextInt();
		for(int j = 0; j < tc; j++) {
			int n = f.nextInt();
			long sum = 0;
			long[] powers = new long[n];
			long[] buffs = new long[n];
			
			for(int i = 0; i < n; i++) {
				powers[i] = f.nextLong();
				sum -= powers[i];
			}
			for(int i = 0; i < n; i++) {
				buffs[i] = f.nextLong();
				sum += buffs[i];
			}
			
			while(!pass(powers, buffs, sum)) {
				sum++;
			}
			
			System.out.println(sum);
		}
		
	}
	
	public static boolean pass(long[] powers, long[] buffs, long power) {
		int i = 0;
		while(i < powers.length && power > powers[i]) {
			power += (buffs[i] - powers[i]);
			i++;
			
		}
		return i == powers.length ?  true :  false;
		
	}
}
