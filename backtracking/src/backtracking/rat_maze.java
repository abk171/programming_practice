package backtracking;
import java.util.Queue;
import java.util.LinkedList;
public class rat_maze {
	/*  Create a solution matrix, initially filled with 0’s.
		Create a recursive function, which takes initial matrix, output matrix and position of rat (i, j).
		if the position is out of the matrix or the position is not valid then return.
		Mark the position output[i][j] as 1 and check if the current position is destination or not. If destination is reached print the output matrix and return.
		Recursively call for position (i+1, j) and (i, j+1).
		Unmark position (i, j), i.e output[i][j] = 0.
	*/
	public class rat {
		Boolean[][] traced_path;
		position p;
		
		public rat(Boolean[][] traced_path, position p) {
			this.traced_path = traced_path;
			this.p = p;
			occupied(p);
		}
		
		public void occupied(position n) {
			this.traced_path[n.y][n.x] = true; 
		}
		
		public Boolean isValid(position n, int[][] map) {
			if(n.y >= map.length || n.y < 0) {
				return false;
				//the case when y is not valid
			}
			
			if(n.x >= map[0].length || n.x < 0) {
				return false;
				//the case when x is not valid
			}
			
			if(traced_path[n.y][n.x]) {
				return false;
				//the case when the position is already taken
			}
			if(map[n.y][n.x]== 0) {
				return false;
				//the case when there is an obstacle in the map
			}
			return true;
		}
	}
	
	public class position {
		int x;
		int y;
		
		public position(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public position right() {
			return new position(this.x + 1, this.y);
		}
		
		public position down() {
			return new position(this.x, this.y + 1);
		}
	}
	
	public Boolean[][] tracer(int[][] map) {
		//I assume that the destination is the bottom right corner and the start is the top left corner
		Boolean[][] traced = new Boolean[map[0].length][map.length];
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[0].length; j++) {
				traced[i][j] = false;
			}
		}
		Queue<rat> q = new LinkedList<rat>();
		rat r = new rat(traced,new position(0,0));
		q.add(r);
		position destination = new position(map[0].length - 1, map.length - 1);
		rat next;
		while(q.peek().isValid(destination, map)) {
			next = q.remove();
			if(next.isValid(next.p.right(), map)) {
				q.add(new rat(next.traced_path, next.p.right()));
			}
			if(next.isValid(next.p.down(), map)) {
				q.add(new rat(next.traced_path, next.p.down()));
			}
		}
		next = q.remove();
		return next.traced_path;
		
		
		
	}
	
	public void print(Boolean[][] map) {
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[0].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int maze[][] = {    { 1, 0, 0, 0 },
			                { 1, 1, 0, 1 },
			                { 0, 1, 0, 0 },
			                { 1, 1, 1, 1 } };
		rat_maze r = new rat_maze();
		r.print(r.tracer(maze));
	}
}
