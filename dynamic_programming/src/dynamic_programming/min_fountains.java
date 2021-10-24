package dynamic_programming;

public class min_fountains {
	public int find_fountains(int[] arr) {
		int f = 0;
		int left = 0;
		for(int i = 0; i < arr.length; i++) {
			if(calculate_left(i,arr) == left)  {
				left = calculate_right(i,arr);
				f++;
			}
		}
		return f;
	}
	
	public int calculate_left(int i, int[] arr) {
		int left = i - arr[i] > 1 ? i : arr[i];		
		return left-1;
	}
	
	public int calculate_right(int i, int[] arr) { 
		int right = i + arr[i] > arr.length ?  arr.length : i + arr[i];
		return right;
	}
}
