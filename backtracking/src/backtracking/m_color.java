package backtracking;

import java.util.Arrays;

public class m_color {
	//Given and undirected graph and a number m, determine if the graph can be coloured with at most m colours such that no two adjacent vertices of the graph are colored with the same color.
	public boolean find_color(int[][] matrix, int[] colors, int max_colors, int node) {
		   //we have to backwards compare in backtracking
		   if(node == matrix.length -1) {
		       return true;
		   }
		   //we have completed the base case
		   // now we need to check through the adjacency matrix
		   // first we must assign a color
		   for(int i = 1; i <= max_colors; i++) {
		       // call is valid and set the color[node] if true
		       if(isValid(matrix, i, node, colors)) {
		    	   colors[node] = i;
			       // then call find_color again and check if its true
			       if(find_color(matrix, colors, max_colors, node+1)) {
			           return true;
			       }
			       // if not then color[node] = 0;
			       colors[node] = 0;
		       }
		      
		       
		   }
		   
		   return false;
		   // we return false when there is no possible solution
		   
		   
		       
		}
		public boolean isValid(int[][] matrix, int color, int node, int[] colors) {
		   //returns true if this node can accept this color?
		   //we have to check if the node can accept this color
		   for(int i = 0; i < matrix.length; i++) {
		       //check if the color of the adjacent is not equal to this color
		       if(matrix[node][i] == 1) {
		           //this means that the node shares an edge with the current node
		           if(colors[i] == color) {
		               //adjacent node has the same color then return false
		               return false;
		           }
		       }
		   }
		   return true;
		}
		
		
		
		public static void main(String args[]) {
			   int graph[][] = {
			            { 0, 1, 1, 1 },
			            { 1, 0, 1, 0 },
			            { 1, 1, 0, 1 },
			            { 1, 0, 1, 0 },
			        };
			   int m = 3; // Number of colors
			   int[] colors = new int[4];
			   m_color c = new m_color();
			   c.find_color(graph, colors, m, 0);
			  System.out.println( Arrays.toString(colors));
		}
		   
	
}
